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
public class ARIT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        System.out.println(" deret : ");
        a = input.nextInt();
        System.out.println(" kelipatan : ");
        b = input.nextInt();
        
        int u = a, s = a;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(u + "\t");
            }
            System.out.println("");
        }
        }
    }

