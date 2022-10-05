package JavaFuncPrograms.src.lambdaHomeTask;

// Use Comparator interface to sort given list of Employees in the alphabetic order of their name
public class SortEmpNamesListWithLambda implements Comparable<SortEmpNamesListWithLambda> {
	String eName = null;
	int eno = 0;

	SortEmpNamesListWithLambda() {
	}

	SortEmpNamesListWithLambda(String name, int numr) {
		this.eName = name;
		this.eno = numr;
	}

	public String getName() {
		return eName;
	}

	public void setName(String Name) {
		this.eName = Name;
	}

	public int getNum() {
		return eno;
	}

	public void setNum(int num) {
		this.eno = num;
	}

	@Override
	public String toString() {
		return "Customer{" + "Name=" + eName + ", numb=" + eno + '}';
	}

	@Override
	public int compareTo(SortEmpNamesListWithLambda o) {
		if (this.getName().charAt(0) < o.getName().charAt(0))
			return -1;
		else if (this.getName().charAt(0) > o.getName().charAt(0))
			return 1;
		else
			return 0;
	}
}