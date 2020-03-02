package model;

public class Product {

	private int proId;
	private String proName;
	private int proPrice;
	public Product(int proId,String proName,int proPrice)
	{
		this.proId=proId;
		this.proName=proName;
		this.proPrice=proPrice;
	}
	public int getProId() {
		return proId;
	}
	public String getProName() {
		return proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	
}
