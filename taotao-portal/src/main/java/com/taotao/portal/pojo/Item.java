package com.taotao.portal.pojo;

public class Item {
	 private String id;
	 private String sell_point;
	 private String image;
	 private long price;
	 private String title;
	 private String category_name;
	 private String item_desc;
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSell_point() {
		return sell_point;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String[] getImages() {
		if(image != null){
			String[] images = image.split(",");
			return images;
		}
		return null;
	}
	 
}
