package com.asia.ProductShipment.board;

import org.springframework.web.multipart.MultipartFile;

public class Board {
	private int noticeID;
	private String title;
	private String body;
	private String writer;
	private String regDate;
	private int coView;
	private int isImportant;
	private int always;
	private String startDate;
	private String endDate;
	private int importantAlways;
	private String importantStartDate;
	private String importantEndDate;
	
	private int allCustSelect;
	
	private int pageNum;
	private int pageSize;
	
	private MultipartFile upload;
	private MultipartFile fileAdd;
	
	private int fileID;
	private String fileName;
	private String filePath;
	private String fileType;
	private String fileSize;
	private String fileStatus;
	private String oldFileList;
	
	private String imageFileID;
	
	private String item_code;
	private String item_nm;
	private String cust_code;
	private String cust_nm;
	
	private String userID;
	private String userType;
	
	private String expiration;
	
	private String addCust;
	private String editCustName;
	private String custSelectList;
	
	private int favoriteID;
	private String favoriteName;
	private String favoriteCustCode;
	public int getNoticeID() {
		return noticeID;
	}
	public void setNoticeID(int noticeID) {
		this.noticeID = noticeID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getCoView() {
		return coView;
	}
	public void setCoView(int coView) {
		this.coView = coView;
	}
	public int getIsImportant() {
		return isImportant;
	}
	public void setIsImportant(int isImportant) {
		this.isImportant = isImportant;
	}
	public int getAlways() {
		return always;
	}
	public void setAlways(int always) {
		this.always = always;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getImportantAlways() {
		return importantAlways;
	}
	public void setImportantAlways(int importantAlways) {
		this.importantAlways = importantAlways;
	}
	public String getImportantStartDate() {
		return importantStartDate;
	}
	public void setImportantStartDate(String importantStartDate) {
		this.importantStartDate = importantStartDate;
	}
	public String getImportantEndDate() {
		return importantEndDate;
	}
	public void setImportantEndDate(String importantEndDate) {
		this.importantEndDate = importantEndDate;
	}
	public int getAllCustSelect() {
		return allCustSelect;
	}
	public void setAllCustSelect(int allCustSelect) {
		this.allCustSelect = allCustSelect;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public MultipartFile getFileAdd() {
		return fileAdd;
	}
	public void setFileAdd(MultipartFile fileAdd) {
		this.fileAdd = fileAdd;
	}
	public int getFileID() {
		return fileID;
	}
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public String getOldFileList() {
		return oldFileList;
	}
	public void setOldFileList(String oldFileList) {
		this.oldFileList = oldFileList;
	}
	public String getImageFileID() {
		return imageFileID;
	}
	public void setImageFileID(String imageFileID) {
		this.imageFileID = imageFileID;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_nm() {
		return item_nm;
	}
	public void setItem_nm(String item_nm) {
		this.item_nm = item_nm;
	}
	public String getCust_code() {
		return cust_code;
	}
	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}
	public String getCust_nm() {
		return cust_nm;
	}
	public void setCust_nm(String cust_nm) {
		this.cust_nm = cust_nm;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getAddCust() {
		return addCust;
	}
	public void setAddCust(String addCust) {
		this.addCust = addCust;
	}
	public String getEditCustName() {
		return editCustName;
	}
	public void setEditCustName(String editCustName) {
		this.editCustName = editCustName;
	}
	public String getCustSelectList() {
		return custSelectList;
	}
	public void setCustSelectList(String custSelectList) {
		this.custSelectList = custSelectList;
	}
	public int getFavoriteID() {
		return favoriteID;
	}
	public void setFavoriteID(int favoriteID) {
		this.favoriteID = favoriteID;
	}
	public String getFavoriteName() {
		return favoriteName;
	}
	public void setFavoriteName(String favoriteName) {
		this.favoriteName = favoriteName;
	}
	public String getFavoriteCustCode() {
		return favoriteCustCode;
	}
	public void setFavoriteCustCode(String favoriteCustCode) {
		this.favoriteCustCode = favoriteCustCode;
	}
	
	
}
