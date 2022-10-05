package JavaFuncPrograms.src.lambdaHomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Use Comparator interface to sort given list of Employees in the alphabetic order of their name
public class SortEmpNamesListWithOutLambda implements Comparator<SortEmpNamesListWithOutLambda> {
	String eName = null;
	int eno = 0;

	SortEmpNamesListWithOutLambda() {
	}

	SortEmpNamesListWithOutLambda(String name, int numr) {
		this.eName = name;
		this.eno = numr;
	}

	public String getName() {
		return eName;
	}

	public void setName(String Name) {
		this.eName = Name;
	}

	public Integer getNum() {
		return eno;
	}

	public void setNum(Integer num) {
		this.eno = num;
	}

	public static void main(String args[]) {
		List<SortEmpNamesListWithOutLambda> empNames = new ArrayList<>();
		empNames.add(new SortEmpNamesListWithOutLambda("vijay", 10));
		empNames.add(new SortEmpNamesListWithOutLambda("djay", 02));
		empNames.add(new SortEmpNamesListWithOutLambda("wijay", 30));
		empNames.add(new SortEmpNamesListWithOutLambda("kijay", 04));
		empNames.add(new SortEmpNamesListWithOutLambda("aijay", 05));
		System.out.println(empNames);
		Collections.sort(empNames, new SortEmpNamesListWithOutLambda());
		System.out.println(empNames);
	}

	@Override
	public String toString() {
		return "Customer{" + "Name=" + eName + ", numb=" + eno + '}';
	}

	@Override
	public int compare(SortEmpNamesListWithOutLambda o1, SortEmpNamesListWithOutLambda o2) {
		return o1.getName().compareTo(o2.getName());
	}
}