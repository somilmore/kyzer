package com.example.web.job;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.web.model.Transaction;
import com.example.web.repository.TransactionRepository;
import com.example.web.service.PdfService;
import com.example.web.service.TransService;
import com.itextpdf.text.DocumentException;

@Component
public class MyScheduler {
	@Autowired
	TransactionRepository repo;
	
	@Autowired
	TransService service;
	
	@Autowired
	PdfService pdfService;

	
	
	List<JSONObject> list2;
	

	
	public List<JSONObject>  getData(){
		
		List<Transaction> list= repo.findByProcessSatausOrderByCollectionId("N");
		
		list2 = service.receipt(list);
		
		return list2;
	}


	@Scheduled(fixedRate = 5000)
	public void generatePDF() throws IOException, DocumentException {
		List<JSONObject> data;
		
		if(list2==null)
		data= getData();
		else
			data=list2;
			
		 List<JSONObject> recordsToProcess = new ArrayList<>();
		 int batchSize=10;
	        
	        synchronized (data) {
	            int endIndex = Math.min(batchSize, data.size());
	            recordsToProcess.addAll(data.subList(0, endIndex));
	            data.subList(0, endIndex).clear();
	        }
		
		
		
		for(int i=0;i<recordsToProcess.size();i++) {
			JSONObject json = recordsToProcess.get(i);
			
			String check=json.getString("collectionId");
			
			if(check.subSequence(0, 4).equals("IRTT") || check.subSequence(0, 4).equals("ORTT")) {
				
				 ByteArrayOutputStream baos = pdfService.generatePDF(json);
				 byte[] content = baos.toByteArray();
			        String filePath = "C:\\Users\\Somil\\Desktop\\RBL Bank\\Pdf\\"+check+".pdf";
			        Files.write(Paths.get(filePath), content);
			       
			        List<Transaction> trans = repo.findAllByCollectionId(json.getString("collectionId"));
			        
			        for (Transaction entity : trans) {
			        
			        json.put("processStatus", "Y");
			        entity.setProcessSataus("Y");
			        }
			        repo.saveAll(trans);
			}
			
		}
    }
	
}
