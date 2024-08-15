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
public class try1 {
    public static void main(String[] args) {
        
        int[][] a = {
            {2, 4},
            {4, 5},
            {6, 7},
            {6, 8},
        };
        int[][] b = {
            {3, 5},
            {5, 6},
            {2, 4},
            {6, 8},
        };
        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] * b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
