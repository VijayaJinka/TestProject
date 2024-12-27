package StringBuffer;

public class StringConcept {


        public static void main(String[] args) {

            //Difference Between StringBuffer and StringBuilder:
            //1. StringBuffer is synchronized whereas StringBuilder is not synchronized
            //2. StringBuffer is slow in performance whereas StringBuilder is fast in performance

            //StringBufferConcepts is a mutable version of strings

            //That means for the same string object we can modify, edit, delete for the same string object

            //Syntax of creating a StringBuffer Object:
            //StringBuffer objName=new StringBuffer();

            StringBuffer sb1=new StringBuffer("Hello");

            System.out.println(sb1);

            sb1.append(" World");

            System.out.println(sb1);

            sb1.append(" New Day in Progress");

            System.out.println(sb1);

            //Inserting the Data at 5th Index Position
            sb1.insert(5,"Java");

            System.out.println(sb1);

            //Deleting the character that is present at 8th index position
            sb1.deleteCharAt(8);

            System.out.println(sb1);

            //How many Characters does the stringbuffer hold
            //By Default the capacity of a string buffer is 16 characters
            //If the capacity is exceeded it will increase it's size by 1.5n
            System.out.println(sb1.capacity());

            //Reverses the current string
            System.out.println(sb1.reverse());

            //Deletes the characters between 8th index position to 15th index position
            sb1.delete(8,15);

            System.out.println(sb1);

            System.out.println(sb1.reverse());

            //Setting the length of the string as 8 characters
            sb1.setLength(8);

            System.out.println(sb1);

            //Replacing the values from one particular index position to another index position
            //With the given word
            System.out.println(sb1.replace(2,6,"Python"));

//        System.out.println(sb1.repeat("Python",10));

            //Converts the string buffer object to a string
            String s4=sb1.toString();

            System.out.println(s4);
        }
    }

