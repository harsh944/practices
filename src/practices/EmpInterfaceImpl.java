package practices;

import java.util.List;

public class EmpInterfaceImpl implements EmpInterface {

	@Override
	public int employeeSalary(List<Integer> salaries) {
		// TODO Auto-generated method stub
		int boom = 0;
		for(Integer ss:salaries) {
			boom +=ss;
		}
		return boom;
	}

}
