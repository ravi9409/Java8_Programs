package lambdasinaction.appa.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeBasedOnName {

    int eno;
    String ename;
    SortEmployeeBasedOnName(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return eno + " " + ename;
    }
}

class Test {
    public static void main(String[] args) {
        //Program to sort the employee objects based on ename
        ArrayList<SortEmployeeBasedOnName> al = new ArrayList<SortEmployeeBasedOnName>();
        al.add(new SortEmployeeBasedOnName(101, "Durga"));
        al.add(new SortEmployeeBasedOnName(105, "Ravi"));
        al.add(new SortEmployeeBasedOnName(103, "Shiva"));
        al.add(new SortEmployeeBasedOnName(112, "Ali"));
        al.add(new SortEmployeeBasedOnName(104, "Pavan"));
        System.out.println("Before Sorting "+al);
        Collections.sort(al, (e1, e2) -> (e1.ename.compareTo(e2.ename)<0) ? -1 : (e1.ename.compareTo(e2.ename)>0) ? 1 : 0);
        System.out.println("After Sorting "+al);

    }
}