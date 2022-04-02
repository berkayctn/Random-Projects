import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    /*
    There is probably a more effective solution for this problem but here is my solution :)
    -> I also used hashMap to show which character appears how many times to enhance my solution


    1- This code piece indicates whether the given String is unique by checking that String's chars.
    2- If one char appears more than one time then this String value is not unique.

    example = abcdefgh -> Unique
              aaaabbbccc -> Not Unique

     */


    public static String UniqueOrNot(String s) {

        String result = "";
        int countOfChar = 0;
        char temp;

        ArrayList<Character> arrForStrings = new ArrayList<>();
        HashMap<Character, Integer> timesOccurred = new HashMap<>();

        //I filled the characters into an arraylist
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arrForStrings.add(c);
        }

        //Check whether the given String is unique
        for (int j = 0; j < arrForStrings.size(); j++) {
            countOfChar = 0;

            for (int y = 0; y < arrForStrings.size(); y++) {
                temp = arrForStrings.get(j);
                if (temp == arrForStrings.get(y)) {
                    countOfChar++;
                }

                timesOccurred.put(temp, countOfChar);
            }
        }

        //Print if string is unique
        for (HashMap.Entry<Character, Integer> uniqueChecker : timesOccurred.entrySet()) {
            if (uniqueChecker.getValue() > 1) {
                result = "not unique !";
            } else {
                result = "unique ! ";
            }
        }

        System.out.println(timesOccurred);
        return "So it's " + result + "\n";
    }

    public static void main(String[] args) {
        System.out.println(UniqueOrNot("aaabbbccccclalalahehehesjshshhssssss"));
        System.out.println(UniqueOrNot("berkay"));
        System.out.println(UniqueOrNot("cetinnn"));

    }
}
