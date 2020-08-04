package com.interfacePrograms;

public class Invoice implements Products,CustomerInfo{
	public  String name;
	public String product;
	public int qty;
	public Double price;
	public String add;


	String customerName(String cName)
	{
		name=cName;
		return name;

	}
	String productName(String pName)
	{
		product=pName;
		return product;
	}
	int productQuantity(int pQty)
	{
		qty=pQty;
		return qty;
	}
	Double productPrice(Double pPrice)
	{
		price=pPrice;
		return price;
	}


	@Override
	public Double calculateAmount() {
		// TODO Auto-generated method stub
		return (double) (price*qty);
	}
	
	@Override
	public String detailofCustomer(String country) {
		add=country;
		return add;

	}
}