package com.gogu.primecheck;

import java.util.Scanner;

class PrimeCheck {
    public static void main(String args[]) {
        int b;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");

        int num = scan.nextInt();
        scan.close();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            b = num % i;
            if (b == 0) {
                isPrime = false;
                break;
            }


        }

        if (isPrime && num > 1)
            System.out.println(num + " is a Prime Number");

        else
            System.out.println(num + " is not a Prime Number");
    }
}
