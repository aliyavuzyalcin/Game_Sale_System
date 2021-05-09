package gameSalesSystem.entity.concrete;

import gameSalesSystem.entity.abstracts.Entity;

public class Game implements Entity {
	
	private int id;
	private String type;
	private String title;
	private double price;
	
	public Game(int id, String type, String title, double price) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
