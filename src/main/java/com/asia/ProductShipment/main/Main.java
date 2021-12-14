package com.asia.ProductShipment.main;

import lombok.Data;

@Data
public class Main {
	//CUSTOM
	private String fr_date;
	private String to_date;
	private String detailViewData;
	private String Authorities;
	
	//SALE.SDDO_SHIP_M
	private String SHIP_REG_DD;
	private String LOGI_CODE;
	private String SHIP_SEQ;
	private String SHIP_DD;
	private String SALE_BZ_PLC;
	private String ISSU_BZ_PLC;
	private String ORGAN_CODE;
	private String SM_CODE;
	private String CUST_CODE;
	private String DLV_PLC_CODE;
	private String DLV_PLC;
	private String NATION_CODE;
	private String SALE_DIV_OR;
	private String SHIP_PROOF;
	private String WARE_H_CODE;
	private String ARRV_CODE;
	private String CAR_CODE;
	private String CAR_WGT_OR;
	private String CRRG_OR;
	private String FARE_OR;
	private String MGR_OR;
	private String CAR_CUST_CODE;
	private String CRRG_AMT;
	private String ITEM_QUALITY;
	private String PRC_LVL_CD;
	private String SHIP_QTY;
	private String SHIP_WGT;
	private String ADD_SUB_WGT;
	private String SALE_WGT;
	private String CURRENCY_CODE;
	private String CURRENCY_AMT;
	private String EXCH_RT;
	private String WON_AMT;
	private String VAT;
	private String BILLING_YN;
	private String PRINT_TIME;
	private String SHIP_RQST_REG_DD;
	private String SHIP_RQST_SEQ;
	private String BAS_SHIP_REG_DD;
	private String BAS_SHIP_SEQ;
	private String CLAIM_REG_DD;
	private String CLAIM_SEQ;
	private String INVO_REG_DD;
	private String INVO_SEQ;
	private String REMARK;
	private String SALE_DD;
	private String SALE_REG_DD;
	private String SALE_LOGI_CODE;
	private String SALE_SEQ;
	private String SHIP_OR_CD;
	private String WORK_DATE;
	private String WORK_USER;
	private String PRT_TIME;
	private String DELI_CUST_CODE;
	private String FARE_OR1;
	private String FARE_OR2;
	private String FARE_OR3;
	private String WORK_CNT;
	private String CRRG_PRC;
	private String CAR_UNIT;
	private String DPRT_CODE;
	private String UNLOAD_PRC;
	private String UNLOAD_AMT;
	private String UPLOAD_MAN;
	private String TRAN_TIME;
	private String CONTAINER_NUM;
	private String SEAL_NUM;
	
	//SALE.SDDO_SHIP_D
	private String SHIP_DTL_SEQ; 
	private String ROLLNO_FCT; 
	private String ROLLNO_MCH; 
	private String ROLLNO_DD; 
	private String ROLLNO_SEQ; 
	private String ROLLNO_DIV; 
	private String ITEM_CODE; 
	private String ITEM_SIZE; 
	private String WGT; 
	private String ADD_SUB_CD; 
	private String RTN_OR_CD; 
	private String UNIT_PRC; 
	private String RTN_SHIP_REG_DD; 
	private String RTN_LOGI_CODE; 
	private String RTN_SHIP_SEQ; 
	private String ACCEPT_REG_DD; 
	private String ACCEPT_SEQ;
	
	
	public String getDetailViewData() {
		return detailViewData;
	}
	public void setDetailViewData(String detailViewData) {
		this.detailViewData = detailViewData;
	}
	public String getFr_date() {
		return fr_date;
	}
	public void setFr_date(String fr_date) {
		this.fr_date = fr_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getSHIP_REG_DD() {
		return SHIP_REG_DD;
	}
	public void setSHIP_REG_DD(String sHIP_REG_DD) {
		SHIP_REG_DD = sHIP_REG_DD;
	}
	public String getLOGI_CODE() {
		return LOGI_CODE;
	}
	public void setLOGI_CODE(String lOGI_CODE) {
		LOGI_CODE = lOGI_CODE;
	}
	public String getSHIP_SEQ() {
		return SHIP_SEQ;
	}
	public void setSHIP_SEQ(String sHIP_SEQ) {
		SHIP_SEQ = sHIP_SEQ;
	}
	public String getSHIP_DD() {
		return SHIP_DD;
	}
	public void setSHIP_DD(String sHIP_DD) {
		SHIP_DD = sHIP_DD;
	}
	public String getSALE_BZ_PLC() {
		return SALE_BZ_PLC;
	}
	public void setSALE_BZ_PLC(String sALE_BZ_PLC) {
		SALE_BZ_PLC = sALE_BZ_PLC;
	}
	public String getISSU_BZ_PLC() {
		return ISSU_BZ_PLC;
	}
	public void setISSU_BZ_PLC(String iSSU_BZ_PLC) {
		ISSU_BZ_PLC = iSSU_BZ_PLC;
	}
	public String getORGAN_CODE() {
		return ORGAN_CODE;
	}
	public void setORGAN_CODE(String oRGAN_CODE) {
		ORGAN_CODE = oRGAN_CODE;
	}
	public String getSM_CODE() {
		return SM_CODE;
	}
	public void setSM_CODE(String sM_CODE) {
		SM_CODE = sM_CODE;
	}
	public String getCUST_CODE() {
		return CUST_CODE;
	}
	public void setCUST_CODE(String cUST_CODE) {
		CUST_CODE = cUST_CODE;
	}
	public String getDLV_PLC_CODE() {
		return DLV_PLC_CODE;
	}
	public void setDLV_PLC_CODE(String dLV_PLC_CODE) {
		DLV_PLC_CODE = dLV_PLC_CODE;
	}
	public String getDLV_PLC() {
		return DLV_PLC;
	}
	public void setDLV_PLC(String dLV_PLC) {
		DLV_PLC = dLV_PLC;
	}
	public String getNATION_CODE() {
		return NATION_CODE;
	}
	public void setNATION_CODE(String nATION_CODE) {
		NATION_CODE = nATION_CODE;
	}
	public String getSALE_DIV_OR() {
		return SALE_DIV_OR;
	}
	public void setSALE_DIV_OR(String sALE_DIV_OR) {
		SALE_DIV_OR = sALE_DIV_OR;
	}
	public String getSHIP_PROOF() {
		return SHIP_PROOF;
	}
	public void setSHIP_PROOF(String sHIP_PROOF) {
		SHIP_PROOF = sHIP_PROOF;
	}
	public String getWARE_H_CODE() {
		return WARE_H_CODE;
	}
	public void setWARE_H_CODE(String wARE_H_CODE) {
		WARE_H_CODE = wARE_H_CODE;
	}
	public String getARRV_CODE() {
		return ARRV_CODE;
	}
	public void setARRV_CODE(String aRRV_CODE) {
		ARRV_CODE = aRRV_CODE;
	}
	public String getCAR_CODE() {
		return CAR_CODE;
	}
	public void setCAR_CODE(String cAR_CODE) {
		CAR_CODE = cAR_CODE;
	}
	public String getCAR_WGT_OR() {
		return CAR_WGT_OR;
	}
	public void setCAR_WGT_OR(String cAR_WGT_OR) {
		CAR_WGT_OR = cAR_WGT_OR;
	}
	public String getCRRG_OR() {
		return CRRG_OR;
	}
	public void setCRRG_OR(String cRRG_OR) {
		CRRG_OR = cRRG_OR;
	}
	public String getFARE_OR() {
		return FARE_OR;
	}
	public void setFARE_OR(String fARE_OR) {
		FARE_OR = fARE_OR;
	}
	public String getMGR_OR() {
		return MGR_OR;
	}
	public void setMGR_OR(String mGR_OR) {
		MGR_OR = mGR_OR;
	}
	public String getCAR_CUST_CODE() {
		return CAR_CUST_CODE;
	}
	public void setCAR_CUST_CODE(String cAR_CUST_CODE) {
		CAR_CUST_CODE = cAR_CUST_CODE;
	}
	public String getCRRG_AMT() {
		return CRRG_AMT;
	}
	public void setCRRG_AMT(String cRRG_AMT) {
		CRRG_AMT = cRRG_AMT;
	}
	public String getITEM_QUALITY() {
		return ITEM_QUALITY;
	}
	public void setITEM_QUALITY(String iTEM_QUALITY) {
		ITEM_QUALITY = iTEM_QUALITY;
	}
	public String getPRC_LVL_CD() {
		return PRC_LVL_CD;
	}
	public void setPRC_LVL_CD(String pRC_LVL_CD) {
		PRC_LVL_CD = pRC_LVL_CD;
	}
	public String getSHIP_QTY() {
		return SHIP_QTY;
	}
	public void setSHIP_QTY(String sHIP_QTY) {
		SHIP_QTY = sHIP_QTY;
	}
	public String getSHIP_WGT() {
		return SHIP_WGT;
	}
	public void setSHIP_WGT(String sHIP_WGT) {
		SHIP_WGT = sHIP_WGT;
	}
	public String getADD_SUB_WGT() {
		return ADD_SUB_WGT;
	}
	public void setADD_SUB_WGT(String aDD_SUB_WGT) {
		ADD_SUB_WGT = aDD_SUB_WGT;
	}
	public String getSALE_WGT() {
		return SALE_WGT;
	}
	public void setSALE_WGT(String sALE_WGT) {
		SALE_WGT = sALE_WGT;
	}
	public String getCURRENCY_CODE() {
		return CURRENCY_CODE;
	}
	public void setCURRENCY_CODE(String cURRENCY_CODE) {
		CURRENCY_CODE = cURRENCY_CODE;
	}
	public String getCURRENCY_AMT() {
		return CURRENCY_AMT;
	}
	public void setCURRENCY_AMT(String cURRENCY_AMT) {
		CURRENCY_AMT = cURRENCY_AMT;
	}
	public String getEXCH_RT() {
		return EXCH_RT;
	}
	public void setEXCH_RT(String eXCH_RT) {
		EXCH_RT = eXCH_RT;
	}
	public String getWON_AMT() {
		return WON_AMT;
	}
	public void setWON_AMT(String wON_AMT) {
		WON_AMT = wON_AMT;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	public String getBILLING_YN() {
		return BILLING_YN;
	}
	public void setBILLING_YN(String bILLING_YN) {
		BILLING_YN = bILLING_YN;
	}
	public String getPRINT_TIME() {
		return PRINT_TIME;
	}
	public void setPRINT_TIME(String pRINT_TIME) {
		PRINT_TIME = pRINT_TIME;
	}
	public String getSHIP_RQST_REG_DD() {
		return SHIP_RQST_REG_DD;
	}
	public void setSHIP_RQST_REG_DD(String sHIP_RQST_REG_DD) {
		SHIP_RQST_REG_DD = sHIP_RQST_REG_DD;
	}
	public String getSHIP_RQST_SEQ() {
		return SHIP_RQST_SEQ;
	}
	public void setSHIP_RQST_SEQ(String sHIP_RQST_SEQ) {
		SHIP_RQST_SEQ = sHIP_RQST_SEQ;
	}
	public String getBAS_SHIP_REG_DD() {
		return BAS_SHIP_REG_DD;
	}
	public void setBAS_SHIP_REG_DD(String bAS_SHIP_REG_DD) {
		BAS_SHIP_REG_DD = bAS_SHIP_REG_DD;
	}
	public String getBAS_SHIP_SEQ() {
		return BAS_SHIP_SEQ;
	}
	public void setBAS_SHIP_SEQ(String bAS_SHIP_SEQ) {
		BAS_SHIP_SEQ = bAS_SHIP_SEQ;
	}
	public String getCLAIM_REG_DD() {
		return CLAIM_REG_DD;
	}
	public void setCLAIM_REG_DD(String cLAIM_REG_DD) {
		CLAIM_REG_DD = cLAIM_REG_DD;
	}
	public String getCLAIM_SEQ() {
		return CLAIM_SEQ;
	}
	public void setCLAIM_SEQ(String cLAIM_SEQ) {
		CLAIM_SEQ = cLAIM_SEQ;
	}
	public String getINVO_REG_DD() {
		return INVO_REG_DD;
	}
	public void setINVO_REG_DD(String iNVO_REG_DD) {
		INVO_REG_DD = iNVO_REG_DD;
	}
	public String getINVO_SEQ() {
		return INVO_SEQ;
	}
	public void setINVO_SEQ(String iNVO_SEQ) {
		INVO_SEQ = iNVO_SEQ;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getSALE_DD() {
		return SALE_DD;
	}
	public void setSALE_DD(String sALE_DD) {
		SALE_DD = sALE_DD;
	}
	public String getSALE_REG_DD() {
		return SALE_REG_DD;
	}
	public void setSALE_REG_DD(String sALE_REG_DD) {
		SALE_REG_DD = sALE_REG_DD;
	}
	public String getSALE_LOGI_CODE() {
		return SALE_LOGI_CODE;
	}
	public void setSALE_LOGI_CODE(String sALE_LOGI_CODE) {
		SALE_LOGI_CODE = sALE_LOGI_CODE;
	}
	public String getSALE_SEQ() {
		return SALE_SEQ;
	}
	public void setSALE_SEQ(String sALE_SEQ) {
		SALE_SEQ = sALE_SEQ;
	}
	public String getSHIP_OR_CD() {
		return SHIP_OR_CD;
	}
	public void setSHIP_OR_CD(String sHIP_OR_CD) {
		SHIP_OR_CD = sHIP_OR_CD;
	}
	public String getWORK_DATE() {
		return WORK_DATE;
	}
	public void setWORK_DATE(String wORK_DATE) {
		WORK_DATE = wORK_DATE;
	}
	public String getWORK_USER() {
		return WORK_USER;
	}
	public void setWORK_USER(String wORK_USER) {
		WORK_USER = wORK_USER;
	}
	public String getPRT_TIME() {
		return PRT_TIME;
	}
	public void setPRT_TIME(String pRT_TIME) {
		PRT_TIME = pRT_TIME;
	}
	public String getDELI_CUST_CODE() {
		return DELI_CUST_CODE;
	}
	public void setDELI_CUST_CODE(String dELI_CUST_CODE) {
		DELI_CUST_CODE = dELI_CUST_CODE;
	}
	public String getFARE_OR1() {
		return FARE_OR1;
	}
	public void setFARE_OR1(String fARE_OR1) {
		FARE_OR1 = fARE_OR1;
	}
	public String getFARE_OR2() {
		return FARE_OR2;
	}
	public void setFARE_OR2(String fARE_OR2) {
		FARE_OR2 = fARE_OR2;
	}
	public String getFARE_OR3() {
		return FARE_OR3;
	}
	public void setFARE_OR3(String fARE_OR3) {
		FARE_OR3 = fARE_OR3;
	}
	public String getWORK_CNT() {
		return WORK_CNT;
	}
	public void setWORK_CNT(String wORK_CNT) {
		WORK_CNT = wORK_CNT;
	}
	public String getCRRG_PRC() {
		return CRRG_PRC;
	}
	public void setCRRG_PRC(String cRRG_PRC) {
		CRRG_PRC = cRRG_PRC;
	}
	public String getCAR_UNIT() {
		return CAR_UNIT;
	}
	public void setCAR_UNIT(String cAR_UNIT) {
		CAR_UNIT = cAR_UNIT;
	}
	public String getDPRT_CODE() {
		return DPRT_CODE;
	}
	public void setDPRT_CODE(String dPRT_CODE) {
		DPRT_CODE = dPRT_CODE;
	}
	public String getUNLOAD_PRC() {
		return UNLOAD_PRC;
	}
	public void setUNLOAD_PRC(String uNLOAD_PRC) {
		UNLOAD_PRC = uNLOAD_PRC;
	}
	public String getUNLOAD_AMT() {
		return UNLOAD_AMT;
	}
	public void setUNLOAD_AMT(String uNLOAD_AMT) {
		UNLOAD_AMT = uNLOAD_AMT;
	}
	public String getUPLOAD_MAN() {
		return UPLOAD_MAN;
	}
	public void setUPLOAD_MAN(String uPLOAD_MAN) {
		UPLOAD_MAN = uPLOAD_MAN;
	}
	public String getTRAN_TIME() {
		return TRAN_TIME;
	}
	public void setTRAN_TIME(String tRAN_TIME) {
		TRAN_TIME = tRAN_TIME;
	}
	public String getCONTAINER_NUM() {
		return CONTAINER_NUM;
	}
	public void setCONTAINER_NUM(String cONTAINER_NUM) {
		CONTAINER_NUM = cONTAINER_NUM;
	}
	public String getSEAL_NUM() {
		return SEAL_NUM;
	}
	public void setSEAL_NUM(String sEAL_NUM) {
		SEAL_NUM = sEAL_NUM;
	}
	public String getSHIP_DTL_SEQ() {
		return SHIP_DTL_SEQ;
	}
	public void setSHIP_DTL_SEQ(String sHIP_DTL_SEQ) {
		SHIP_DTL_SEQ = sHIP_DTL_SEQ;
	}
	public String getROLLNO_FCT() {
		return ROLLNO_FCT;
	}
	public void setROLLNO_FCT(String rOLLNO_FCT) {
		ROLLNO_FCT = rOLLNO_FCT;
	}
	public String getROLLNO_MCH() {
		return ROLLNO_MCH;
	}
	public void setROLLNO_MCH(String rOLLNO_MCH) {
		ROLLNO_MCH = rOLLNO_MCH;
	}
	public String getROLLNO_DD() {
		return ROLLNO_DD;
	}
	public void setROLLNO_DD(String rOLLNO_DD) {
		ROLLNO_DD = rOLLNO_DD;
	}
	public String getROLLNO_SEQ() {
		return ROLLNO_SEQ;
	}
	public void setROLLNO_SEQ(String rOLLNO_SEQ) {
		ROLLNO_SEQ = rOLLNO_SEQ;
	}
	public String getROLLNO_DIV() {
		return ROLLNO_DIV;
	}
	public void setROLLNO_DIV(String rOLLNO_DIV) {
		ROLLNO_DIV = rOLLNO_DIV;
	}
	public String getITEM_CODE() {
		return ITEM_CODE;
	}
	public void setITEM_CODE(String iTEM_CODE) {
		ITEM_CODE = iTEM_CODE;
	}
	public String getITEM_SIZE() {
		return ITEM_SIZE;
	}
	public void setITEM_SIZE(String iTEM_SIZE) {
		ITEM_SIZE = iTEM_SIZE;
	}
	public String getWGT() {
		return WGT;
	}
	public void setWGT(String wGT) {
		WGT = wGT;
	}
	public String getADD_SUB_CD() {
		return ADD_SUB_CD;
	}
	public void setADD_SUB_CD(String aDD_SUB_CD) {
		ADD_SUB_CD = aDD_SUB_CD;
	}
	public String getRTN_OR_CD() {
		return RTN_OR_CD;
	}
	public void setRTN_OR_CD(String rTN_OR_CD) {
		RTN_OR_CD = rTN_OR_CD;
	}
	public String getUNIT_PRC() {
		return UNIT_PRC;
	}
	public void setUNIT_PRC(String uNIT_PRC) {
		UNIT_PRC = uNIT_PRC;
	}
	public String getRTN_SHIP_REG_DD() {
		return RTN_SHIP_REG_DD;
	}
	public void setRTN_SHIP_REG_DD(String rTN_SHIP_REG_DD) {
		RTN_SHIP_REG_DD = rTN_SHIP_REG_DD;
	}
	public String getRTN_LOGI_CODE() {
		return RTN_LOGI_CODE;
	}
	public void setRTN_LOGI_CODE(String rTN_LOGI_CODE) {
		RTN_LOGI_CODE = rTN_LOGI_CODE;
	}
	public String getRTN_SHIP_SEQ() {
		return RTN_SHIP_SEQ;
	}
	public void setRTN_SHIP_SEQ(String rTN_SHIP_SEQ) {
		RTN_SHIP_SEQ = rTN_SHIP_SEQ;
	}
	public String getACCEPT_REG_DD() {
		return ACCEPT_REG_DD;
	}
	public void setACCEPT_REG_DD(String aCCEPT_REG_DD) {
		ACCEPT_REG_DD = aCCEPT_REG_DD;
	}
	public String getACCEPT_SEQ() {
		return ACCEPT_SEQ;
	}
	public void setACCEPT_SEQ(String aCCEPT_SEQ) {
		ACCEPT_SEQ = aCCEPT_SEQ;
	}
	public String getAuthorities() {
		return Authorities;
	}
	public void setAuthorities(String authorities) {
		Authorities = authorities;
	}
	
}
