/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRAINNING_ARRAY;

/**
 *
 * @author rafig
 */
public class try3 {
    public static void main(String[] args) {
        
        int[][] a = {
            {10,22,33,40},
            {21,30,17,14},
        };
        int[][] b = {
            {19,28,38,44},
            {11,16,24,26}
        };
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(a[i][j] - b [i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
