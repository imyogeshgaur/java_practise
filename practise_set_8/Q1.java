package practise_set_8;

import java.util.Scanner;

class Employee {
    int salaryOfEmployee;
    String nameOfEmployee;

    public void setSalary(int s) {
        salaryOfEmployee = s;
    }

    public void setName(String n) {
        nameOfEmployee = n;
    }

    public String getName() {
        return nameOfEmployee;
    }

    public int getSalary() {
        return salaryOfEmployee;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Name of the Employee : ");
        String name = sc.nextLine();
        Employee emp1 = new Employee();
        emp1.setName(name);
        System.out.printf("Enter the Salary of the Employee : ");
        int Salary = sc.nextInt();
        emp1.setSalary(Salary);
        sc.close();
        int s = emp1.getSalary();
        String n = emp1.getName();
        System.out.printf("%s has a salary of %d ", n, s);

    }
}
