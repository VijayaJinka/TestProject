package Interfaces;

public class ImplementInt implements SampleInterface {
    @Override
    public void method1() {
        System.out.println("Executed from method 1");
    }

    @Override
    public void method2() {
        System.out.println("Executed from method 2");
    }

    @Override
    public void method3() {
        System.out.println("Executed from method 3");
    }

    @Override
    public int method4() {
        return 6*10;
    }

    @Override
    public int method5() {
        return 5-2;
    }

    @Override
    public double method6() {
        return 6.3/23.63;
    }

    public static void main(String[] args) {
        ImplementInt i4=new ImplementInt();
        i4.method1();
        System.out.println(i4.method4());
    }
}

