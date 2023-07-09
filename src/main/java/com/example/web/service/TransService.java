package com.example.web.service;

import java.util.*;

import org.json.*;
import org.springframework.stereotype.Service;

import com.example.web.model.Transaction;

@Service
public class TransService {

public List<JSONObject> receipt(List<Transaction> list){
		
	List<JSONObject> ans = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			
			JSONObject response = new JSONObject();
			Transaction record = list.get(i);
			
			String collection=record.getCollectionId();
				
				response.put("collectionId",record.getCollectionId());
				response.put("inOutInd",record.getiNOutInd());
				response.put("custEmail",record.getCustEmail());
				response.put("brId",record.getBrId());
				response.put("brName",record.getBrName());
				response.put("brAddress1",record.getBrAddr1());
				response.put("brAddress2",record.getBrAddr2());
				response.put("brAddress3",record.getBrAddr3());
				response.put("brCity",record.getBrcity());
				response.put("brState",record.getBrState());
				response.put("brPinCode",record.getBrPincode());
				response.put("lodgeDate",record.getDateTime());
				response.put("partyName",record.getOtherPartyName());
				response.put("partyAddress1",record.getPartyAddr1());
				response.put("partyAddress2",record.getPartyAddr2());
				response.put("partyAddress3",record.getPartyAddr3());
				response.put("partyCity",record.getPartyCity());
				response.put("partyState",record.getPartyState());
				response.put("partyCountry",record.getPartyCounty());
				response.put("partyPinCode",record.getPartyPincode());
				response.put("otherPartyName",record.getOtherPartyName());
				response.put("otherPartyAddress1",record.getOtherPartyAddr1());
				response.put("otherPartyAddress2",record.getOtherPartyAddr2());
				response.put("otherPartyAddress3",record.getOtherPartyAddr3());
				response.put("otherPartyCity",record.getOtherPartyCity());
				response.put("otherPartyState",record.getOtherPartyState());
				response.put("otherPartyCountry",record.getOtherPartyCounty());
				response.put("otherPartyPinCode",record.getOtherPartyPincode());
				response.put("purposeCode",record.getPurposeCode());
				response.put("purposeDescription",record.getPurposeDesc());
				response.put("remitCurrency",record.getRemitCrncy());
				response.put("remitAmount",record.getRemitAmt());
				response.put("rate",record.getRate());
				response.put("operateAccount",record.getOperAcct());
				response.put("operateAccountCurrency",record.getOperAcctCrncy());
				response.put("processStatus",record.getProcessSataus());
				
				  JSONArray jsonArray = new JSONArray();
				
				while(collection.equals(record.getCollectionId())) {
					JSONObject inner = new JSONObject();
					
					if(record.getIndicator().equals("CHRG")) {
						
						inner.put("indicator",record.getIndicator());
						inner.put("remarks",record.getRemarksCharges());
						inner.put("currenyCode",record.getOperAcctCrncy());
						inner.put("amount",record.getTtlChrgCollAmt());
						
						jsonArray.put(inner);
					}
					else {
						response.put("partTranType",record.getPartTranType());
						response.put("tranAmount",record.getTranAmt());
						response.put("valueDate",record.getValidDate());
						inner.put("indicator",record.getIndicator());
						inner.put("remarks",record.getRemitCrncy()+" "+record.getRemitAmt()+" "+record.getValidDate()+" to A/C No. "+record.getOperAcct());;
						inner.put("currenyCode",record.getOperAcctCrncy());
						inner.put("amount",record.getTranAmt());
						
						jsonArray.put(inner);
					}
					i++;
					
					if(i==list.size())
						break;
					record = list.get(i);
				}
				i--;
				
				
				   
			response.put("transactionDetails",jsonArray);
			
		        
		ans.add(response);
		}
		
return ans;
	}
}
