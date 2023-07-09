package com.example.web.service;
import java.io.IOException;
import java.text.DecimalFormat;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;

import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PdfService {
	
	float dr=0;
	float cr=0;
	

	
	public ByteArrayOutputStream generatePDF(JSONObject data) throws IOException, DocumentException {
		
		
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

	 		
        	
       	 Document document = new Document();
	        document.setPageSize(PageSize.A4);
  
	        
	        PdfWriter writer=PdfWriter.getInstance(document, baos);
	        
	       HeaderFooterHandler handler = new HeaderFooterHandler();
           writer.setPageEvent(handler);

	        
           document.open();
	        
	        float fontSize = 9f;
		    Font boldFont = new Font(FontFamily.COURIER,fontSize);
		     
	        Paragraph paragraph = new Paragraph("RBL Bank",boldFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
	        
            paragraph = new Paragraph("  ",boldFont);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
       	
       	JSONObject jsonObject = data;
           
           paragraph = new Paragraph("Branch : "+jsonObject.getString("brName"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
	        
           paragraph = new Paragraph("Place : "+jsonObject.getString("brAddress1"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
           
           paragraph = new Paragraph(jsonObject.getString("brAddress2"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
           
           paragraph = new Paragraph(jsonObject.getString("brAddress3"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
           
           paragraph = new Paragraph(jsonObject.getString("brCity"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
           
           paragraph = new Paragraph(jsonObject.getString("brState"),boldFont);
           paragraph.setAlignment(Element.ALIGN_LEFT);
           document.add(paragraph);
           
          
       PdfContentByte canvas=writer.getDirectContent();
       float x= 35f;
       float y= document.top()-143f;
       float width = document.right()-30f;
       float height = 20f;
       
       float[] dash = {5f,3f};
       canvas.setLineDash(dash,0f);
       canvas.rectangle(x,y,width,height);
       canvas.stroke();
       
       paragraph = new Paragraph("  ",boldFont);
       paragraph.setAlignment(Element.ALIGN_CENTER); 
         document.add(paragraph);
       
    paragraph = new Paragraph("Category : Banking and Financial Services",boldFont);
     paragraph.setAlignment(Element.ALIGN_CENTER); 
       document.add(paragraph);
       
       document.add(Chunk.NEWLINE);

           
      
           if(jsonObject.getString("inOutInd").equals("O")) {
           	
           	paragraph = new Paragraph("Debit Advice for Outward Remittance",boldFont);
               paragraph.setAlignment(Element.ALIGN_CENTER);
               document.add(paragraph);
           }
           else {
           	
           	paragraph = new Paragraph("Credit Advice for Inward Remittance",boldFont);
               paragraph.setAlignment(Element.ALIGN_CENTER);
               document.add(paragraph);
           }
               
   
               paragraph = new Paragraph("Dated: "+(jsonObject.getString("lodgeDate")),boldFont);
               paragraph.setAlignment(Element.ALIGN_RIGHT);
               document.add(paragraph);
               
               paragraph = new Paragraph("To,",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               paragraph = new Paragraph("Name : "+jsonObject.getString("otherPartyName"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
   	        
               paragraph = new Paragraph("Address : "+jsonObject.getString("otherPartyAddress1"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               if(jsonObject.has("otherPartyAddress2")) {
               	 paragraph = new Paragraph(jsonObject.getString("otherPartyAddress2"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
               
               if(jsonObject.has("otherPartyAddress3")) {
                    paragraph = new Paragraph(jsonObject.getString("otherPartyAddress3"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
                    
               if(jsonObject.has("otherPartyCity")) {
                    paragraph = new Paragraph(jsonObject.getString("otherPartyCity"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
                    
               if(jsonObject.has("otherPartyState")) {   
                    paragraph = new Paragraph(jsonObject.getString("otherPartyState"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
              
               paragraph = new Paragraph(jsonObject.getString("otherPartyCountry"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               
               paragraph = new Paragraph("We hereby credited/debited your account as detailed below",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               paragraph = new Paragraph("Our Reference Number : "+jsonObject.getString("collectionId"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);

               paragraph = new Paragraph("Dated: "+jsonObject.getString("valueDate"),boldFont);
               paragraph.setAlignment(Element.ALIGN_RIGHT);
               document.add(paragraph);
               
               paragraph = new Paragraph("Beneficiary Details",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               paragraph = new Paragraph("Name : "+jsonObject.getString("partyName"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
   	        
               paragraph = new Paragraph("Address : "+jsonObject.getString("partyAddress1"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               if(jsonObject.has("partyAddress2")) {
               	 paragraph = new Paragraph(jsonObject.getString("partyAddress2"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
               
               if(jsonObject.has("partyAddress3")) {
                    paragraph = new Paragraph(jsonObject.getString("partyAddress3"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
                    
               if(jsonObject.has("partyCity")) {
                    paragraph = new Paragraph(jsonObject.getString("partyCity"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
                    
               if(jsonObject.has("partyState")) {   
                    paragraph = new Paragraph(jsonObject.getString("partyState"),boldFont);
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
               }
               
               paragraph = new Paragraph(jsonObject.getString("partyCountry"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               paragraph = new Paragraph("Purpose Code : "+jsonObject.getString("purposeCode")+" - "+jsonObject.getString("purposeDescription"),boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
           
           
			
             
			    
			    JSONArray transactionDetails = jsonObject.getJSONArray("transactionDetails");
			    
			    paragraph = new Paragraph("------------------------------------------------------------------------------------------------",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
			    
             
               
			    PdfPTable table = new PdfPTable(4); // Number of columns
			    table.setWidthPercentage(100);
				table.setWidths(new float[] { 180f, 30f, 30f, 60f});
				table.getDefaultCell().setBorderWidth(0);
		
		        addTableHeader(table,boldFont);
		        
		        document.add(table);
		        
		        paragraph = new Paragraph("------------------------------------------------------------------------------------------------",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
		        
		        PdfPTable mtable = new PdfPTable(4); // Number of columns
			    mtable.setWidthPercentage(100);
				mtable.setWidths(new float[] { 180f, 30f, 30f, 60f});
				mtable.getDefaultCell().setBorderWidth(0);
		        
				
		        addTableRows(mtable, transactionDetails,jsonObject,boldFont);
		        
		        document.add(mtable);
		        
		        paragraph = new Paragraph("------------------------------------------------------------------------------------------------",boldFont);
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
				
		        PdfPTable ltable = new PdfPTable(4); // Number of columns
			    ltable.setWidthPercentage(100);
				ltable.setWidths(new float[] { 180f, 30f, 30f, 60f});
				ltable.getDefaultCell().setBorderWidth(0);
		       
               if(jsonObject.getString("inOutInd").equals("O")) {
               	
               	ltable.addCell(new Paragraph("Amount Debited to Your Account : "+jsonObject.getString("operateAccount"),boldFont));
               	ltable.addCell(new Paragraph("",boldFont));
               	ltable.addCell(new Paragraph("INR",boldFont));
               	DecimalFormat decimalFormat = new DecimalFormat("0.########");
               	ltable.addCell(new Paragraph(decimalFormat.format(dr+cr),boldFont));
               	
               }
               else {
               	
               	ltable.addCell(new Paragraph("Amount Credited to Your Account : "+jsonObject.getString("operateAccount"),boldFont));
               	ltable.addCell(new Paragraph("",boldFont));
               	ltable.addCell(new Paragraph("INR",boldFont));
               	DecimalFormat decimalFormat = new DecimalFormat("0.########");
               	ltable.addCell(new Paragraph(decimalFormat.format(dr),boldFont));
               	
               	ltable.addCell(new Paragraph("Amount Debited to Your Account : "+jsonObject.getString("operateAccount"),boldFont));
               	ltable.addCell(new Paragraph("",boldFont));
               	ltable.addCell(new Paragraph("INR",boldFont));
               	decimalFormat = new DecimalFormat("0.########");
               	ltable.addCell(new Paragraph(decimalFormat.format(cr),boldFont));
               	
               }
             

               document.add(ltable);
               
	     cr=0;
	     dr=0;
	     
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
	    document.add(Chunk.NEWLINE);
        
        paragraph = new Paragraph("THIS DOCUMENT SHOULD NOT BE CONSIDERED AS AN INVOICE AS PER GST ACT.",boldFont);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
        
        paragraph = new Paragraph("GST COMPLIANT INVOICE WILL BE ISSUED SEPARATELY AS PER STATUTORY TIMELINE",boldFont);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
	     
        document.close(); 

    
            
	        return baos;
    }
	
	

	void addTableHeader(PdfPTable table,Font boldFont) {
        String[] headers = {"Transaction Particulars", "Rate", "Currency", "Amount"};
        
        
        for (String header : headers) {
        	
            PdfPCell cell = new PdfPCell(new Paragraph(header,boldFont));
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
        }
        
      
    }

    void addTableRows(PdfPTable table, JSONArray transactionDetails, JSONObject json, Font boldFont) throws DocumentException {
    	
    	
    	
    	if(json.getString("inOutInd").equals("O")) {
    		table.addCell(new Paragraph("Foreign Outward Remittance Amount",boldFont));
        	table.addCell(new Paragraph("",boldFont));
        	table.addCell(new Paragraph("",boldFont));
        	table.addCell(new Paragraph("",boldFont));
    	}
    	else {
    		table.addCell(new Paragraph("Foreign Inward Remittance Amount",boldFont));
        	table.addCell(new Paragraph("",boldFont));
        	table.addCell(new Paragraph("",boldFont));
        	table.addCell(new Paragraph("",boldFont));
    	}
    	
    	 
   
    	for (int i = 0; i < transactionDetails.length(); i++) {
    		JSONObject jsonObject = transactionDetails.getJSONObject(i);
    		
    		if(jsonObject.getString("indicator").equals("DRCR")) {
    			
    			table.addCell(new Paragraph(jsonObject.getString("remarks"),boldFont));
    			
    			table.addCell(new Paragraph(String.valueOf(json.getFloat("rate")),boldFont));
    			table.addCell(new Paragraph(jsonObject.getString("currenyCode"),boldFont));
    			
    			DecimalFormat decimalFormat = new DecimalFormat("0.########");
    			table.addCell(new Paragraph(decimalFormat.format(jsonObject.getFloat("amount")),boldFont));
    			
    			dr += jsonObject.getFloat("amount");
    			break;
    		}
    	}
    	
    	table.addCell(new Paragraph(" ",boldFont));
    	table.addCell(new Paragraph(" ",boldFont));
    	table.addCell(new Paragraph(" ",boldFont));
    	table.addCell(new Paragraph(" ",boldFont));
    	
    	table.addCell(new Paragraph("Charges Details",boldFont));
    	table.addCell(new Paragraph("",boldFont));
    	table.addCell(new Paragraph("",boldFont));
    	table.addCell(new Paragraph("",boldFont));
    	
    	for (int i = 0; i < transactionDetails.length(); i++) {
    		JSONObject jsonObject = transactionDetails.getJSONObject(i);
    		
    		if(jsonObject.getString("indicator").equals("CHRG")) {
    			
    			table.addCell(new Paragraph(jsonObject.getString("remarks"),boldFont));
    			
    			table.addCell(new Paragraph("",boldFont));
    			table.addCell(new Paragraph(jsonObject.getString("currenyCode"),boldFont));
    			
    			DecimalFormat decimalFormat = new DecimalFormat("0.########");
    			table.addCell(new Paragraph(decimalFormat.format(jsonObject.getFloat("amount")),boldFont));
    			
    			cr += jsonObject.getFloat("amount");
    		}
    	}
    	
   

    }
	
   
   
	
}
