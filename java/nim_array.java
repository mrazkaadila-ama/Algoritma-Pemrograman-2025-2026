import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        int[] digits = new int[nim.length()];

        // Pisahkan digit
        for (int i = 0; i < nim.length(); i++) {
            digits[i] = Character.getNumericValue(nim.charAt(i));
        }

        int total = 0;
        int maks = digits[0], minim = digits[0];

        for (int d : digits) {
            total += d;
            if (d > maks) maks = d;
            if (d < minim) minim = d;
        }

        double rata = (double) total / digits.length;

        // Reverse array
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        System.out.println("Array digit: " + Arrays.toString(digits));
        System.out.println("Total digit: " + total);
        System.out.println("Digit maksimum: " + maks);
        System.out.println("Digit minimum: " + minim);
        System.out.println("Rata-rata digit: " + rata);
        System.out.println("Reverse array: " + Arrays.toString(reverse));
    }
}
