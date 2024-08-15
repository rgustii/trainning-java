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
public class UKL3X5 {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3,4,5},
            {2,3,4,5,6},
            {3,4,5,6,7},
        };
        int [][] b = {
            {4,5,6,7,8},
            {5,6,7,8,9},
            {10,11,12,13,14},
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] - b[i][j]+"");
            }
            System.out.println("");
        }
    }
}
