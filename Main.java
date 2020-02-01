import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        char option = ' ';

        do {
            System.out.println("Welcome to Employee Record Console Application");
            System.out.println("[a] - Add Employee Record.");
            System.out.println("[b] - Show Employees Record.");
            System.out.println("[c] - Exit Program");
            System.out.print("Option: ");
            option = scan.nextLine().charAt(0);

            switch(option) {
                case 'a': case 'A': 
                        employees.add(createEmployee(scan));
                    break;

                case 'b': case 'B': 
                        showEmployees(employees);
                    break;

                case 'c': case 'C': flag = false; break;
            }
        } while(flag);
        scan.close();
    }

    private static Employee createEmployee(Scanner scan) {
        System.out.println("Add Employee Record");
        System.out.print("Enter First Name: ");
        String fname = scan.nextLine();
        System.out.print("Enter Last Name: ");
        String lname = scan.nextLine();
        return new Employee(fname, lname);
    }

    private static void showEmployees(ArrayList<Employee> employees) {
        if(employees.isEmpty()) {
            System.out.println("No Available Record.");
        } else {
            System.out.println("List of Employees");
            for(Employee employee : employees) {
                System.out.println(
                    "Employee No. " + employees.indexOf(employee) + 
                    ", Employee Name: " + employee.getFullName()
                );
            }
        }
    }
}