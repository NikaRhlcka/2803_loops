package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        3 types of loops:
        - for
        -while (advantage of "for loop": we can put any value, do not to know it beforehand)
        -Do while loop (condition is checked in the end compared to "while loop")
         */

        //for_loop();
        //while_loop();
        //do_while_loop();
        //continue_statement();
        return_statement();
    }

    static void for_loop(){
        // for(start; condition; next step)
        for(int counter =0; counter <10;counter++){
            System.out.println("Hello world!");
        }
    }

    static void while_loop(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input any number:");
        int a = scanner.nextInt();
        //int a = 0;

        while (a <10){
            System.out.println("second - Hello world!");
            a++;
        }
    }

    static void do_while_loop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number:");
        int b = scanner.nextInt();

        do{
            System.out.println("Hello World!");
            b++;

            if (b == 8){
                break; //stops loop when b reaching 8
            }
        }while (b<10);
    }

    static void continue_statement(){

       for (int i=0;i<10;i++){
           if (i == 8){
               continue;//skips number 8, continued to number 9
           }
           System.out.println(i);
       }
    }

    static void return_statement(){
        for (int i=0;i<10;i++){
            if (i == 8){
                continue;//skips number 8, continued to number 9
            }
            return; //exits out of method
        }
    }
}
