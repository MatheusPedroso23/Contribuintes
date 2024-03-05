package Entities;

public abstract class  TaxPlayer {
	
	private String name;
	private double anuallncone;
	
	public  TaxPlayer() {
		
	}

	public TaxPlayer(String name, double anuallncone) {
		this.name = name;
		this.anuallncone = anuallncone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnuallncone() {
		return anuallncone;
	}

	public void setAnuallncone(double anuallncone) {
		this.anuallncone = anuallncone;
	}
	
	public abstract double tax();
	
	
	

	
	
	

}
