package BreakoutRoomInterfaceAssignment.Subpackage;

public class FullTimeEmployee implements Employee{
    private double monthlySalary;
    private String benefits;

    /*public FullTimeEmployee(double monthlySalary, String benefits) {
        this.monthlySalary = monthlySalary;
        this.benefits = benefits;
    }*/

    public void setEmployeeValues(double monthlySalary, String benefits){
        this.monthlySalary = monthlySalary;
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary() {

        return monthlySalary;
    }

    @Override
    public String getBenefits() {


        return benefits;
    }


    }

