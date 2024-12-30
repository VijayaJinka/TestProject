package Interfaces;


    public class ImplementInterfaceForFunctional
            implements FunctionalInterfacesConcept{

        @Override
        public void sample() {
            System.out.println("Sample Method is implemented in the current class");
        }

        public static void main(String[] args) {
            FunctionalInterfacesConcept f3=new ImplementInterfaceForFunctional();
            f3.sample();
        }
    }

