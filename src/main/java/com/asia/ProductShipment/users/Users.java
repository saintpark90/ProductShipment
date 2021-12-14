package com.asia.ProductShipment.users;

import lombok.Data;

@Data
public class Users {
	private String ID;
	private String PWD;
	private String CUST_CODE;
	private String CUST_NM;
	private String BZ_REG_NO;
	private String CHK_PWD;
	private String STOP;
	private String TYPE;
	
	private String selectCust;
	private String nowPWD;
	private String newPWD;
	
	public String getNowPWD() {
		return nowPWD;
	}
	public void setNowPWD(String nowPWD) {
		this.nowPWD = nowPWD;
	}
	public String getNewPWD() {
		return newPWD;
	}
	public void setNewPWD(String newPWD) {
		this.newPWD = newPWD;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getCUST_CODE() {
		return CUST_CODE;
	}
	public void setCUST_CODE(String cUST_CODE) {
		CUST_CODE = cUST_CODE;
	}
	public String getCUST_NM() {
		return CUST_NM;
	}
	public void setCUST_NM(String cUST_NM) {
		CUST_NM = cUST_NM;
	}
	public String getBZ_REG_NO() {
		return BZ_REG_NO;
	}
	public void setBZ_REG_NO(String bZ_REG_NO) {
		BZ_REG_NO = bZ_REG_NO;
	}
	public String getCHK_PWD() {
		return CHK_PWD;
	}
	public void setCHK_PWD(String cHK_PWD) {
		CHK_PWD = cHK_PWD;
	}
	public String getSTOP() {
		return STOP;
	}
	public void setSTOP(String sTOP) {
		STOP = sTOP;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getSelectCust() {
		return selectCust;
	}
	public void setSelectCust(String selectCust) {
		this.selectCust = selectCust;
	}
}
