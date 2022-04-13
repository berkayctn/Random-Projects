import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    //This code piece counts the characters of a randomly generated String expression.
    //I combined my own projects (HuaweiTalentInterviewQuestion and RandomStringGenerator) to implement this project.

    public static void uniqueOrNot(String s) {
        String result = "";
        int countOfChar = 0;

        ArrayList<Character> arrForStrings = new ArrayList<>();
        HashMap<Character, Integer> timesOccurred = new HashMap<>();

        //I filled the characters into an arraylist
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arrForStrings.add(c);
        }

      
        for (int j = 0; j < arrForStrings.size(); j++) {
            countOfChar = 0;

            for (int y = 0; y < arrForStrings.size(); y++) {
                if (arrForStrings.get(j) == arrForStrings.get(y)) {
                    countOfChar++;
                }

                timesOccurred.put(arrForStrings.get(j), countOfChar);
            }
        }

        System.out.println(timesOccurred);
    }


    public static String randomStringGenerator() {

        //This code piece generates a 50 digits random string using ASCII codes
        //Each time, the string is generated completely randomly

        char[] arr = new char[50];
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            double randomNumber = Math.floor(Math.random() * (122 - 97 + 1)) + 97;
            char convertedChar = (char) randomNumber;
            arr[i] = convertedChar;
            s.append(arr[i]);
        }
        return s.toString();
    }


    public static void main(String[] args) {
        uniqueOrNot(randomStringGenerator());
        uniqueOrNot(randomStringGenerator());
        uniqueOrNot(randomStringGenerator());
        uniqueOrNot(randomStringGenerator());
        uniqueOrNot(randomStringGenerator());
    }
}
