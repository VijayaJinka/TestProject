package BreakoutRoomInterfaceAssignment.Subpackage;

public class Company {
    public static void main(String[] args) {
         //FullTimeEmployee ftEmployee1 = new FullTimeEmployee(20000, "Health Insurance");
        FullTimeEmployee ftEmployee1 = new FullTimeEmployee();
        ftEmployee1.setEmployeeValues(20000, "Health Insurance");
         PartTimeEmployee ptEmployee1 = new PartTimeEmployee(5000, 8);
         Contract ctEmployee1 = new Contract(100);

        System.out.println("Full-Time Employee Salary: $" + ftEmployee1.calculateSalary());
        System.out.println("Full-Time Employee Benefits: " + ftEmployee1.getBenefits());

        System.out.println("Part-Time Employee Salary: $" + ptEmployee1.calculateSalary());
        System.out.println("Part-Time Employee Benefits: " + ptEmployee1.getBenefits());

        System.out.println("Contract Employee Salary: $" + ctEmployee1.calculateSalary());
        System.out.println("Contract Employee Benefits: " + ctEmployee1.getBenefits());
    }
}
