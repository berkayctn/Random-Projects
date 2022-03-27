public class Main {

    public static void main(String[] args) {

        //This code piece generates a 50 digits random string using ASCII codes
        //Each time, the string is generated completely randomly

         char[] arr = new char[50];

        for (int i = 0; i < arr.length; i++) {
            double randomNumber = Math.floor(Math.random() * (90 - 65 + 1)) + 65;
            char convertedChar = (char) randomNumber;
            arr[i] = convertedChar;
            System.out.print(arr[i]);
        }
    }
}
