package BreakoutRoomInterfaceAssignment.Subpackage;

public class Contract implements Employee{
    double contractAmount;


    public  Contract(double contractAmount) {
            this.contractAmount = contractAmount;
    }
    @Override
    public double calculateSalary() {

        return contractAmount;
    }

    @Override
    public String getBenefits() {


        return "No benefits";
    }


}


