package com.example.web.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Entity
@Table(name="RTTA_REMITTANCE_TBL")
@Component
public class Transaction {

	@Id
	@Column(name = "SRL_NUM")
	private int srlNum;
	
	@Column(name = "INDICATOR")
	private String indicator;
	
	@Column(name = "IN_OUT_IND")
	private String iNOutInd;
	
	@Column(name = "CIF_ID")
	private String cifId;
	
	@Column(name = "CUST_EMAIL")
	private String custEmail;
	
	@Column(name = "PROCESS_STATUS")
	private String processSataus;
	
	@Column(name = "BR_ID")
	private String brId;
	
	@Column(name = "BR_NAME")
	private String brName;
	
	@Column(name = "BR_ADDR_1")
	private String brAddr1;
	
	@Column(name = "BR_ADDR_2")
	private String brAddr2;
	
	@Column(name = "BR_ADDR_3")
	private String brAddr3;
	
	@Column(name = "BR_CITY")
	private String brcity;
	
	@Column(name = "BR_STATE")
	private String brState;
	
	@Column(name = "BR_PIN_CODE")
	private String brPincode; 
	
	@Column(name = "COLLECTION_ID")
	private String collectionId;
	
	@Column(name = "LODG_DATE")
	private String dateTime;
	
	@Column(name = "PARTY_NAME")
	private String partyName;
	
	@Column(name = "PARTY_ADDR1")
	private String partyAddr1;
	
	@Column(name = "PARTY_ADDR2")
	private String partyAddr2;
	
	@Column(name = "PARTY_ADDR3")
	private String partyAddr3;
	
	@Column(name = "PARTY_CITY")
	private String partyCity;
	
	@Column(name = "PARTY_STATE")
	private String partyState;
	
	@Column(name = "PARTY_COUNTRY")
	private String partyCounty;
	
	@Column(name = "PARTY_PIN_CODE")
	private String partyPincode;
	
	@Column(name = "OTHER_PARTY_NAME")
	private String otherPartyName;
	
	@Column(name = "OTHER_PARTY_ADDR_1")
	private String otherPartyAddr1;
	
	@Column(name = "OTHER_PARTY_ADDR_2")
	private String otherPartyAddr2;
	
	@Column(name = "OTHER_PARTY_ADDR_3")
	private String otherPartyAddr3;
	
	@Column(name = "OTHER_PARTY_CITY")
	private String otherPartyCity;
	
	@Column(name = "OTHER_PARTY_STATE")
	private String otherPartyState;
	
	@Column(name = "OTHER_PARTY_COUNTRY")
	private String  otherPartyCounty;
	
	@Column(name = "OTHER_PARTY_PIN_CODE")
	private String  otherPartyPincode;
	
	@Column(name = "PURPOSE_CODE")
	private String purposeCode;
	
	@Column(name = "PURPOSE_DESC")
	private String  purposeDesc;
	
	@Column(name = "REMIT_CRNCY")
	private String remitCrncy;
	
	@Column(name = "REMIT_AMT")
	private Float remitAmt;
	
	@Column(name = "RATE")
	private Float rate; 
	
	@Column(name = "OPER_ACCT")
	private String operAcct;
	
	@Column(name = "OPER_ACCT_CRNCY")
	private String operAcctCrncy;
	
	@Column(name = "REMARKS_CHARGES")
	private String remarksCharges;
	
	@Column(name = "CHRG_CRNCY_CODE")
	private String chrgCrncyCode; 
	
	@Column(name = "TTL_CHRG_COLL_AMT")
	private Float ttlChrgCollAmt;
	
	@Column(name = "VALUE_DATE")
	private String validDate;
	
	@Column(name = "CHRG_OPER_ACCT")
	private String chrgOperAcct;
	
	@Column(name = "CHRG_OPER_CRNCY")
	private String chrgOperCrncy;
	
	@Column(name = "PART_TRAN_TYPE")
	private String partTranType;
	
	@Column(name = "TRAN_AMT")
	private Float tranAmt;

	public int getSrlNum() {
		return srlNum;
	}

	public void setSrlNum(int srlNum) {
		this.srlNum = srlNum;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getiNOutInd() {
		return iNOutInd;
	}

	public void setiNOutInd(String iNOutInd) {
		this.iNOutInd = iNOutInd;
	}

	public String getCifId() {
		return cifId;
	}

	public void setCifId(String cifId) {
		this.cifId = cifId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getProcessSataus() {
		return processSataus;
	}

	public void setProcessSataus(String processSataus) {
		this.processSataus = processSataus;
	}

	public String getBrId() {
		return brId;
	}

	public void setBrId(String brId) {
		this.brId = brId;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getBrAddr1() {
		return brAddr1;
	}

	public void setBrAddr1(String brAddr1) {
		this.brAddr1 = brAddr1;
	}

	public String getBrAddr2() {
		return brAddr2;
	}

	public void setBrAddr2(String brAddr2) {
		this.brAddr2 = brAddr2;
	}

	public String getBrAddr3() {
		return brAddr3;
	}

	public void setBrAddr3(String brAddr3) {
		this.brAddr3 = brAddr3;
	}

	public String getBrcity() {
		return brcity;
	}

	public void setBrcity(String brcity) {
		this.brcity = brcity;
	}

	public String getBrState() {
		return brState;
	}

	public void setBrState(String brState) {
		this.brState = brState;
	}

	public String getBrPincode() {
		return brPincode;
	}

	public void setBrPincode(String brPincode) {
		this.brPincode = brPincode;
	}

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyAddr1() {
		return partyAddr1;
	}

	public void setPartyAddr1(String partyAddr1) {
		this.partyAddr1 = partyAddr1;
	}

	public String getPartyAddr2() {
		return partyAddr2;
	}

	public void setPartyAddr2(String partyAddr2) {
		this.partyAddr2 = partyAddr2;
	}

	public String getPartyAddr3() {
		return partyAddr3;
	}

	public void setPartyAddr3(String partyAddr3) {
		this.partyAddr3 = partyAddr3;
	}

	public String getPartyCity() {
		return partyCity;
	}

	public void setPartyCity(String partyCity) {
		this.partyCity = partyCity;
	}

	public String getPartyState() {
		return partyState;
	}

	public void setPartyState(String partyState) {
		this.partyState = partyState;
	}

	public String getPartyCounty() {
		return partyCounty;
	}

	public void setPartyCounty(String partyCounty) {
		this.partyCounty = partyCounty;
	}

	public String getPartyPincode() {
		return partyPincode;
	}

	public void setPartyPincode(String partyPincode) {
		this.partyPincode = partyPincode;
	}

	public String getOtherPartyName() {
		return otherPartyName;
	}

	public void setOtherPartyName(String otherPartyName) {
		this.otherPartyName = otherPartyName;
	}

	public String getOtherPartyAddr1() {
		return otherPartyAddr1;
	}

	public void setOtherPartyAddr1(String otherPartyAddr1) {
		this.otherPartyAddr1 = otherPartyAddr1;
	}

	public String getOtherPartyAddr2() {
		return otherPartyAddr2;
	}

	public void setOtherPartyAddr2(String otherPartyAddr2) {
		this.otherPartyAddr2 = otherPartyAddr2;
	}

	public String getOtherPartyAddr3() {
		return otherPartyAddr3;
	}

	public void setOtherPartyAddr3(String otherPartyAddr3) {
		this.otherPartyAddr3 = otherPartyAddr3;
	}

	public String getOtherPartyCity() {
		return otherPartyCity;
	}

	public void setOtherPartyCity(String otherPartyCity) {
		this.otherPartyCity = otherPartyCity;
	}

	public String getOtherPartyState() {
		return otherPartyState;
	}

	public void setOtherPartyState(String otherPartyState) {
		this.otherPartyState = otherPartyState;
	}

	public String getOtherPartyCounty() {
		return otherPartyCounty;
	}

	public void setOtherPartyCounty(String otherPartyCounty) {
		this.otherPartyCounty = otherPartyCounty;
	}

	public String getOtherPartyPincode() {
		return otherPartyPincode;
	}

	public void setOtherPartyPincode(String otherPartyPincode) {
		this.otherPartyPincode = otherPartyPincode;
	}

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getPurposeDesc() {
		return purposeDesc;
	}

	public void setPurposeDesc(String purposeDesc) {
		this.purposeDesc = purposeDesc;
	}

	public String getRemitCrncy() {
		return remitCrncy;
	}

	public void setRemitCrncy(String remitCrncy) {
		this.remitCrncy = remitCrncy;
	}

	public Float getRemitAmt() {
		return remitAmt;
	}

	public void setRemitAmt(Float remitAmt) {
		
		if(remitAmt==null)
			return;
		
		this.remitAmt = remitAmt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		
		if(rate==null)
			return;
		
		this.rate = rate;
	}

	public String getOperAcct() {
		return operAcct;
	}

	public void setOperAcct(String operAcct) {
		this.operAcct = operAcct;
	}

	public String getOperAcctCrncy() {
		return operAcctCrncy;
	}

	public void setOperAcctCrncy(String operAcctCrncy) {
		this.operAcctCrncy = operAcctCrncy;
	}

	public String getRemarksCharges() {
		return remarksCharges;
	}

	public void setRemarksCharges(String remarksCharges) {
		this.remarksCharges = remarksCharges;
	}

	public String getChrgCrncyCode() {
		return chrgCrncyCode;
	}

	public void setChrgCrncyCode(String chrgCrncyCode) {
		this.chrgCrncyCode = chrgCrncyCode;
	}

	public Float getTtlChrgCollAmt() {
		return ttlChrgCollAmt;
	}

	public void setTtlChrgCollAmt(Float ttlChrgCollAmt) {
		
		if(ttlChrgCollAmt==null)
			return;
		
		this.ttlChrgCollAmt = ttlChrgCollAmt;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getChrgOperAcct() {
		return chrgOperAcct;
	}

	public void setChrgOperAcct(String chrgOperAcct) {
		this.chrgOperAcct = chrgOperAcct;
	}

	public String getChrgOperCrncy() {
		return chrgOperCrncy;
	}

	public void setChrgOperCrncy(String chrgOperCrncy) {
		this.chrgOperCrncy = chrgOperCrncy;
	}

	public String getPartTranType() {
		return partTranType;
	}

	public void setPartTranType(String partTranType) {
		this.partTranType = partTranType;
	}

	public Float getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(Float tranAmt) {
		
		if(tranAmt==null)
			return;
		
		this.tranAmt = tranAmt;
	}

	@Override
	public String toString() {
		return "Transaction [srlNum=" + srlNum + ", indicator=" + indicator + ", iNOutInd=" + iNOutInd + ", cifId="
				+ cifId + ", custEmail=" + custEmail + ", processSataus=" + processSataus + ", brId=" + brId
				+ ", brName=" + brName + ", brAddr1=" + brAddr1 + ", brAddr2=" + brAddr2 + ", brAddr3=" + brAddr3
				+ ", brcity=" + brcity + ", brState=" + brState + ", brPincode=" + brPincode + ", collectionId="
				+ collectionId + ", dateTime=" + dateTime + ", partyName=" + partyName + ", partyAddr1=" + partyAddr1
				+ ", partyAddr2=" + partyAddr2 + ", partyAddr3=" + partyAddr3 + ", partyCity=" + partyCity
				+ ", partyState=" + partyState + ", partyCounty=" + partyCounty + ", partyPincode=" + partyPincode
				+ ", otherPartyName=" + otherPartyName + ", otherPartyAddr1=" + otherPartyAddr1 + ", otherPartyAddr2="
				+ otherPartyAddr2 + ", otherPartyAddr3=" + otherPartyAddr3 + ", otherPartyCity=" + otherPartyCity
				+ ", otherPartyState=" + otherPartyState + ", otherPartyCounty=" + otherPartyCounty
				+ ", otherPartyPincode=" + otherPartyPincode + ", purposeCode=" + purposeCode + ", purposeDesc="
				+ purposeDesc + ", remitCrncy=" + remitCrncy + ", remitAmt=" + remitAmt + ", rate=" + rate
				+ ", operAcct=" + operAcct + ", operAcctCrncy=" + operAcctCrncy + ", remarksCharges=" + remarksCharges
				+ ", chrgCrncyCode=" + chrgCrncyCode + ", ttlChrgCollAmt=" + ttlChrgCollAmt + ", validDate=" + validDate
				+ ", chrgOperAcct=" + chrgOperAcct + ", chrgOperCrncy=" + chrgOperCrncy + ", partTranType="
				+ partTranType + ", tranAmt=" + tranAmt + "]";
	}
	
	
	
	
}
