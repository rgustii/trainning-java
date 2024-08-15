/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning_looping;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class ARIT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        System.out.print(" masukkan suku pertama : ");
        a =  input.nextInt();
        System.out.print(" loncat berapa : ");
        b = input.nextInt();
        
        
            for (int j = a; j > 1; j--) {
                System.out.print(j*b+ "\t");
              
           }
            System.out.println("");
        }
    }
    

