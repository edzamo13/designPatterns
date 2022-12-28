package ec.com.openwebinar.gangOfFour.creationalPatter.prototype.realWord;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Employees implements Cloneable {

	@Getter
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();

	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
