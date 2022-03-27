import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Sum of your numbers : " + sumEquation());
    }

    public static int sumEquation() {
        int sumOfNumbers = 0;

        String number = JOptionPane.showInputDialog(null, "How many numbers do you want to sum");
        int number2 = Integer.parseInt(number);

        for (int i = 0; i < number2; i++) {
            String numberForSum = JOptionPane.showInputDialog(null, "Enter a number to sum");
            int numberEntered = Integer.parseInt(numberForSum);
            sumOfNumbers += numberEntered;
        }

        return sumOfNumbers;
    }
}
