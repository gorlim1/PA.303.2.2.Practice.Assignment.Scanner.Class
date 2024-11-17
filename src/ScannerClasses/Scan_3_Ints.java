package ScannerClasses;

import java.util.Scanner;

public class Scan_3_Ints {

    //Variable declarations
    int scannedInt1;
    int scannedInt2;
    int scannedInt3;

    public void scan_3_Ints() {

        Scanner intScanner = new Scanner(System.in); //New Scanner class object

        System.out.println("Example 1");
        System.out.println("Enter the first integer: ");
        scannedInt1 = intScanner.nextInt();

        System.out.println("Enter the second integer: ");
        scannedInt2 = intScanner.nextInt();

        System.out.println("Enter the third integer: ");
        scannedInt3 = intScanner.nextInt();
        System.out.println();

        //intScanner.close(); with this class run first in main, errors occur maybe because the System.in stream is
        // needed for the second class to run?

        System.out.println("The first integer entered is: " + scannedInt1 + ".");
        System.out.println("The second integer entered is: " + scannedInt2 + ".");
        System.out.println("The third integer entered is: " + scannedInt3 + ".");
        System.out.println("End Example 1");
        System.out.println();
    }
}
