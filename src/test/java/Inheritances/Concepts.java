package Inheritances;

    //Different Types of Inheritance in JAVA:
//1. Single Inheritance --> This is already done
//2. Multilevel Inheritance
//3. Hierarchial Inheritance
//4. Multi Level Inheritance (Not allowed in JAVA)
//5. Hybrid Inheritance
    public class Concepts {

        public static void main(String[] args) {

            ChildClass c2=new ChildClass();
            c2.square(); //Child Class --> Overridden method
            //Parent Class XXXXXX

            c2.parallelogram(); //Child Class

            c2.shapes(); //Grand Parent Class
        }
    }

