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
public class try1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i==1&&j>=10  || j==20 || j==10) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 30; j++) {
                if (i==1&&j<=10|| i==5 || j==1 || j==30) {
                    System.out.print("*");
                }else if (i==1&&j>=20) {
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}
