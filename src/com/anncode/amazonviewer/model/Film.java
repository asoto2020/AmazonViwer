package com.anncode.amazonviewer.model;

public abstract class Film {
	
	private String title;
	private String genre;
	private String creador;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	
	public Film(String title, String genre, String creador, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creador = creador;
		this.duration = duration;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if (viewed == true) {
			visto = "Sí";			
		}else {
			visto = "No";
		}
		return visto;
	}
	
	public boolean getIsViewed() {
		return this.viewed;
	}
	
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	public abstract void view();
	
	

}
