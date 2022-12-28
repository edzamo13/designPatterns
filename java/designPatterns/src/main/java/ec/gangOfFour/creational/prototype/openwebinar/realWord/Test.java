package ec.com.openwebinar.gangOfFour.creationalPatter.prototype.realWord;

import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employees = new Employees();
		employees.loadData();

		Employees employees2 = (Employees) employees.clone();
		Employees employees3 = (Employees) employees.clone();

		List<String> list = employees2.getEmpList();
		list.add("Jhon");
		List<String> list1 = employees3.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + employees.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
