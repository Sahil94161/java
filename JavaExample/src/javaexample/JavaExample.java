/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author gni
 */import java.util.Scanner;
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here//We will find the factorial of this number
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    }

