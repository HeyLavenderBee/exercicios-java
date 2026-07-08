package pilarespoo.company.domain;

public non-sealed class Manager extends Employee{
	private String login;
	private String password;
	private double commission;
	
	public Manager(String name, double salary, String login, String password, double commission) {
		super(name, salary);
		this.login = login;
		this.password = password;
		this.setCommission(commission);
	}
	
	public Manager() {}
	
	@Override
	public String getCode() {
		return "MG" + this.code; //posso acessar diretamente pois está protected no Employee
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String loginString) {
		this.login = loginString;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String passwordString) {
		this.password = passwordString;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	//sobreescrita
	@Override
	public double getFullSalary() {
		return this.salary * this.commission;
	}
	
	//sobrecargas
	public double getFullSalary(double extra) {
		double updatedSalary = this.getFullSalary() + extra;
		this.salary = updatedSalary;
		return updatedSalary;
	}
	
	public double getFullSalary(double extra, double extra2) {
		double updatedSalary = this.getFullSalary() + extra + extra2;
		this.salary = updatedSalary;
		return updatedSalary;
	}
}
