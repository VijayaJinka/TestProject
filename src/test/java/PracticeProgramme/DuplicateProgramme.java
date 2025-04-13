package PracticeProgramme;

public class DuplicateProgramme {

        public static void main(String[] args) {
            String s = "hackerearth";
            char[] character = s.toCharArray();
            boolean isDuplicateFound = false;

            for (int i = 0; i < s.length(); i++) {
                boolean isDuplicate = false;

                for (int j = i + 1; j < s.length(); j++) {  // Compare only forward elements
                    if (character[i] == character[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("Duplicate found: " + character[i]);
                    isDuplicateFound = true;
                }
            }

            if (!isDuplicateFound) {
                System.out.println("No Duplicates found");
            }
        }
    }
