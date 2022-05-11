import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double k = 0.1;
        int steps = 10;
        System.out.println(getArea(steps, k));


        String isPalindrome1 = "eye";
        String isPalindrome2 = "Nikita";

        System.out.println(isPalindrome1 + " is palindrome? " + checkPalindrome(isPalindrome1));
        System.out.println(isPalindrome2 + " is palindrome? " + checkPalindrome(isPalindrome2));

        writeFacts();

    }

    public  static double getArea(int steps, double line) {
        double width = Math.PI / steps;

        double area = 0.0;
        for (int i = 0; i < steps - 1; i++) {
            double height = Math.sin(i * width);
            if (height >= line) {
                height = line;
            }
            double deltaS = width * height;
            area += deltaS;
        }
        return area;
    }


    public static boolean checkPalindrome(String s){
        String lowerString = s.toLowerCase(Locale.ROOT);
        int length = lowerString.length();
        int fromFirst = 0;
        int fromLast = length - 1;
        while (fromLast >= fromFirst) {
            char ftmSymbol = lowerString.charAt(fromFirst++);
            char ltmSymbol = lowerString.charAt(fromLast--);
            if (ftmSymbol != ltmSymbol)
                return false;
        }
        return true;
    }

    public static void writeFacts() {
        char[] name = {'M','Y','K','Y','T','A'};
        int age = 22;
        int birthDate = 1999;
        float weight = 76.6f;
        char gender = 'M';
        double averageGrade = 90.8;
        boolean isTall = true;
        int studyCourse = 5;

        System.out.print("My name is ");
        for (char c : name) {
            System.out.print(c);
        }
        System.out.println("\nI am " + age + ". I was born in " + birthDate);
        System.out.println("My gender is " + gender + " and my weight is " + weight);
        System.out.println("Am I tall? It's " + isTall + ". I'm studying at the "
                + studyCourse + "th course in University and my average grade after 4th course was " + averageGrade);

    }

}

