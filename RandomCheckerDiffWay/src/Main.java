import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    //I also combined this solution with my RandomStringGenerator project using a Character ArrayList for given String.
    //I used HashSet here so you can clearly see duplicate elements and their counts.
    
    static int countDuplicates(String s) {
        ArrayList<Character> arrForStrings = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicateSet = new HashSet<>();

        //I filled the characters into an arraylist
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arrForStrings.add(c);
        }

        //Check for duplicates
        for (int i = 0; i < arrForStrings.size(); i++) {
            if (set.contains(arrForStrings.get(i))) {
                duplicateSet.add(arrForStrings.get(i));
            } else {
                set.add(arrForStrings.get(i));
            }
        }

        System.out.println("All elements : " + arrForStrings);
        System.out.println("Duplicate elements : " + duplicateSet);
        return duplicateSet.size();
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


    //5 attempt for test the code
    public static void main(String[] args)  {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("And the count of the duplicate elements : " + countDuplicates(randomStringGenerator()) + "\n");
        }
    }
}
