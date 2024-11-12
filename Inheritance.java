import java.util.*;
class Employee{
    String name,age,phno,address;
    float salary;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter age:");
        age=sc.nextLine();
        System.out.println("Phno:");
        phno=sc.nextLine();
        System.out.println("Enter address:");
        address=sc.nextLine();
        System.out.println("Enter salary:");
        salary=sc.nextFloat();

    }
    void printSalary(){
        System.out.println("Salary is"+salary);
    }
}
class Officer extends Employee{
    String spec;
    Officer(){
        System.out.println("Enter specialisation:");
        sc.nextLine();
        spec=sc.nextLine();
    }
    void printSpec(){
        System.out.println("Specialisation is"+spec);
    }
    void printAll(){
        System.out.println("**OFFICER DETAILS**");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Phno:"+phno);
        System.out.println("Address:"+address);
        printSalary();
        printSpec();
    }

}
class Manager extends Employee{
    String dept;
    Manager(){
        System.out.println("Enter department:");
        sc.nextLine();
        dept=sc.nextLine();
    }
    void printDept(){
        System.out.println("Department is"+dept);
    }
    void printAll(){
        System.out.println("**MANAGER DETAILS**");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Phno:"+phno);
        System.out.println("Address:"+address);
        printSalary();
        printDept();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("ENTER MANAGER DETAILS");
        Manager m=new Manager();
        System.out.println("ENTER OFFICER DETAILS");
        Officer o=new Officer();
        m.printAll();
        o.printAll();
    }
}
