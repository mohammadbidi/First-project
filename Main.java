package com.bidi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (1>0){
            System.out.println("Enter the fuking num bitch:");
            Scanner myscanner=new Scanner(System.in);
            int number=myscanner.nextInt();
            if (isprime(number)){
                System.out.println("khob ke chi adad avale.");
            }
            else {
                System.out.println("mono emtehan nakon lashi adad aval nist!!");
            }




        }
    }

    static boolean isprime(int number) {
        if (number<2){
            return false;
        }
          else {for (int i=2;i<number;i++)
            if (number%i==0){
                return false;
            }

            return true;
        }



    }
}