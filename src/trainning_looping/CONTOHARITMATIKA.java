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
public class CONTOHARITMATIKA {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan suku pertama:");
        a=input.nextInt();
        System.out.print("Masukan bedanya :");
        b=input.nextInt();
        
        int u=a;
        int s=a;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
                
            }
            System.out.println();
        }
        System.out.println("suku keduanya adalah 5");
    }
}
