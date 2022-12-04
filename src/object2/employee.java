package object2;

import java.math.BigDecimal;

public class employee extends person{
	private String tilte;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;
	
	public String toString() {
		
		return super.toString()+" "+"title - "+this.tilte+" employer" + this.employer+ "name" +this.getEmail();
		//좋은방법
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
