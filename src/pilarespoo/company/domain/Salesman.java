package pilarespoo.company.domain;

public non-sealed class Salesman extends Employee{
	
	private double percentPerSold;
	private int soldAmount;

	public Salesman(String name, double salary, double percentPerSold, int soldAmount) {
		super(name, salary);
		this.setPercentPerSold(percentPerSold);
		this.setSoldAmount(soldAmount);
	}
	
	public Salesman() {}
	
	@Override
	public String getCode() {
		return "SL" + this.code;
	}

	public double getPercentPerSold() {
		return percentPerSold;
	}

	public void setPercentPerSold(double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}

	public int getSoldAmount() {
		return soldAmount;
	}

	public void setSoldAmount(int soldAmount) {
		this.soldAmount = soldAmount;
	}

	@Override
	public double getFullSalary() {
		return this.salary + (soldAmount * percentPerSold) / 100;
	}
}
