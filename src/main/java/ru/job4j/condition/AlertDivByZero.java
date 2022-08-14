package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);

    }

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println(number + " - Could not div by 0.");
            return;
        }
        result = number < 0;
        if (result) {
            System.out.println(number + " - This is negative number");
        }
    }
}
