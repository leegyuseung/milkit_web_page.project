package com.acorn.project.order.dto;

public class OrderListDto {
	
	private int orderId;
	private String userId;
	private String userAddr;
	private String userPostal;
	private String userAddrDetail;
	private int tel;
	private int totalPrice;
	private String orderDate;
	
	private int orderId_Detail;
	private String productId;
	private int amount_deatil;
	
	private String productName;
	private String imagePath;
	private int price;
	
	public OrderListDto() {}

	public OrderListDto(int orderId, String userId, String userAddr, String userPostal, String userAddrDetail, int tel,
			int totalPrice, String orderDate, int orderId_Detail, String productId, int amount_deatil,
			String productName, String imagePath, int price) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.userAddr = userAddr;
		this.userPostal = userPostal;
		this.userAddrDetail = userAddrDetail;
		this.tel = tel;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.orderId_Detail = orderId_Detail;
		this.productId = productId;
		this.amount_deatil = amount_deatil;
		this.productName = productName;
		this.imagePath = imagePath;
		this.price = price;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserPostal() {
		return userPostal;
	}

	public void setUserPostal(String userPostal) {
		this.userPostal = userPostal;
	}

	public String getUserAddrDetail() {
		return userAddrDetail;
	}

	public void setUserAddrDetail(String userAddrDetail) {
		this.userAddrDetail = userAddrDetail;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderId_Detail() {
		return orderId_Detail;
	}

	public void setOrderId_Detail(int orderId_Detail) {
		this.orderId_Detail = orderId_Detail;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getAmount_deatil() {
		return amount_deatil;
	}

	public void setAmount_deatil(int amount_deatil) {
		this.amount_deatil = amount_deatil;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}