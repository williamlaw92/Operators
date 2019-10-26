/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author williamlaw
 */

import java.util.Scanner;
public class Operators {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a;
            System.out.println("How many feet tall are you?");
        a = scan.nextInt();
        int b;
        b = a * 12 ;
        int c;
            System.out.println("How many inches are you?");
        c = scan.nextInt();
        double d;
        d = (b+c) * 2.54;
            System.out.println("you are " +  d +  " centimeters");
         

    }


}
