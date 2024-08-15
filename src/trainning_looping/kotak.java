/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning_looping;

/**
 *
 * @author rafig
 */
public class kotak {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i==1||i==6||j==0||j==5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
