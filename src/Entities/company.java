package Entities;

public class company extends TaxPlayer{

	private int numberofemployees;
	
	public company(String name, double anuallncone, int numberofemployees) {
		super(name, anuallncone);
		this.numberofemployees = numberofemployees;
	}
	
	public int getNumberofemployees() {
		return numberofemployees;
	}
	
	public void setNumberofemployees(int numberofemployees) {
		this.numberofemployees = numberofemployees;
	}

	@Override
	public double tax() {
		if(getNumberofemployees() > 10) {
			
			return getAnuallncone() * 0.14;
		}
		else {
			
			return getAnuallncone() * 0.16;
		}
		
	}
	
	

}
