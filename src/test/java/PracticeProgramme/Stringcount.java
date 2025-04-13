package PracticeProgramme;

public class Stringcount {



        /**
         * Calculates the count of non-space characters in the given string.
         */
        public static void main(String[] args) {

            String a = "This is a string";
            int count = 0;

            for (int i = 0; i < a.length(); i++) {

                if (a.charAt(i) != ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

