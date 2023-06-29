public class Main {
    public static void main(String[] args) {

        int number = 202350;
        System.out.println(number);

        short newNumber = (short) number;
        System.out.println(newNumber);

        int newNumber2 = newNumber;
        System.out.println(newNumber2);
        newNumber2 = number;

        Integer newNumber3 = newNumber2;
        System.out.println(newNumber3);
    }
}