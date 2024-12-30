package BreakoutRoomInterfaceAssignment.Subpackage;

public class PartTimeEmployee implements Employee {
private double hourlyRate;
private int hoursWorked;


public  PartTimeEmployee(double hourlyRate, int hoursWorked) {
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
@Override
public double calculateSalary() {

return hourlyRate*hoursWorked;
}

@Override
public String getBenefits() {

return "No benefits";
}


}
