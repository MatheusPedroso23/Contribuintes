package Entities;

public class individual extends TaxPlayer {
	
	private double healthExpenditures;
	
	public individual(String name, double anuallncone, double healthExpenditures) {
		super(name, anuallncone);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}



	@Override
	public double tax() {
			
		if(getAnuallncone() < 20000.0) {
			return getAnuallncone() * 0.15 - getHealthExpenditures() * 0.5;
		}
		else {
			return getAnuallncone() * 0.25 - getHealthExpenditures() * 0.5;
		}
			
	}

}
