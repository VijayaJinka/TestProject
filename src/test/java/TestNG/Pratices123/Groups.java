package TestNG.Pratices123;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"sanity"},description = "launching application",priority = 1)
    public void launch()
    {
        System.out.println("launch");
    }
    @Test(groups = {"sanity"},priority = 3)
    public void Diagnosis()
    {
        System.out.println("modem diag");
    }
    @Test(groups = {"Regression"},priority =2)
    public void Nikaorders()
    {
        System.out.println("Nika");
    }
    @Test(groups = {"sanity","Regression"},priority =4)
    public void upstream()
    {
        System.out.println("upstream");
    }
    @Test(groups = {"Regression"},priority =5)
    public void AdvancesFilters()
    {
        System.out.println("Advancesfilters");
    }

}

