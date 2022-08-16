/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trytoparsedouble;

/**
 *
 * @author arnol
 */
//The Double. parseDouble() method requires a String argument, but it fails if the String cannot
//be converted to a floating-point number. Write an application in which you try accepting a
//double input from a user and catch a NumberFormatException if one is thrown. The catch
//block forces the number to 0 and displays an appropriate error message. Following the catch
//block, display the number. Save the file as TryToParseDouble.java.

import java.util.Scanner;

class TryToParseDouble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user_input;
        Double myDouble = 0.0;
        boolean cont = true;

        while (cont) {
            try {
                System.out.println("Type in a floating point number:");
                user_input = scan.nextLine();
                myDouble = Double.parseDouble(user_input);
                cont = false;
            } catch (NumberFormatException e) {
                //The catch block forces the number to 0 and displays an appropriate error message.
                System.out.println("0 Error! Only numbers are accepted");
                myDouble = 0.0;
            }
        }

        System.out.println("The floating point number is:\n" + myDouble);
    }
}