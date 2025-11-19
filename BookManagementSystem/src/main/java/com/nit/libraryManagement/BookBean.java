package com.nit.libraryManagement;

public class BookBean 
{
	private String id,name,authorName;
	private int price,quantity;
	public BookBean()
	{
		
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", authorName=" + authorName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	

}
