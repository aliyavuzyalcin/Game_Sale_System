package gameSalesSystem.entity.concrete;

import gameSalesSystem.entity.abstracts.Entity;

public class Campaign implements Entity {
	
	private int type;
	private String name;
	private int duration;
	private String code;
	
	public Campaign(int type, String name, int duration) {
		super();
		this.type = type;
		this.name = name;
		this.duration = duration;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCode() {
		return this.name.concat("OLSA");
	}
	

}
