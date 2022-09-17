import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {
        double salary,byPercent;
        String name;
        Scanner in=new Scanner(System.in);
        System.out.println("Input name:");
        name=in.next();
        System.out.println("Input salary:");
        salary=in.nextDouble();
        System.out.println("Input by percent:");
        byPercent=in.nextDouble();
        Employee emp=new Employee(name,salary);
        emp.raiseSalary(byPercent);
        System.out.println("Name:"+emp.getName()+"      Salary="+emp.getSalary());
    }
}
