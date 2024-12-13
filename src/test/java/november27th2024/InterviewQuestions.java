package november27th2024;
//using while loop remove all duplicates characters of string in java
public class InterviewQuestions {
    public static void main(String[] args) {
        String str="Java";
        for(int i=0;i<str.length();i++) {
            for (int j = i; j < str.length(); j++) {
                if (i + j % 2 == 0) {
                    System.out.println(str.charAt(i));
                }
                    else{
                        System.out.println(str.charAt(j));
                    }
                }
                System.out.println();
            }

    }
}
