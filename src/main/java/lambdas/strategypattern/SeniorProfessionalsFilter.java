package lambdas.strategypattern;

import lambdas.employee.Employee;

public class SeniorProfessionalsFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getExperience() > 10;
	}

}
