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
public class matrix_1 {
    public static void main(String[] args) {
        
        int[][] a = {
            {20,21},
            {12,13},
        };
        int[][] b = {
            {22,23},
            {14,15},
        };
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] * b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
