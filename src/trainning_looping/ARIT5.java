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
public class ARIT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        System.out.print(" deret : ");
        a = input.nextInt();
        System.out.print(" loncat : ");
        b = input.nextInt();
        
        int u = a, s = a;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (u%2 == 0) {
                    System.out.print(u + "\t");
                      
                }
                 u = u + b;
                 s = s + u;
            }
        }
        System.out.println("");
    }
}
