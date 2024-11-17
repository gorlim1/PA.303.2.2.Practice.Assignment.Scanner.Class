package ScannerClasses;

import java.util.Scanner;

public class Scan_Int_Double_String {

    int scannedInt1;
    double scannedDouble1;
    String scannedString1;

    public void scan_Int_Double_String() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Example 2");
        System.out.println("Enter an integer: ");
        scannedInt1 = scanner.nextInt();

        System.out.println("Enter a double: ");
        scannedDouble1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter a string: ");
        scannedString1 = scanner.nextLine();
        System.out.println();

        scanner.close();

        System.out.println("The string entered is: " + scannedString1 + ".");
        System.out.println("The double entered is: " + scannedDouble1 + ".");
        System.out.println("The int entered is: " + scannedInt1 + ".");
        System.out.println("End Example 2");
    }
}
