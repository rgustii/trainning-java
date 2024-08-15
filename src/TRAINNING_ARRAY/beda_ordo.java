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
public class beda_ordo {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3,4},
            {5,6,7,8},               
        };
        int [][] b = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}, 
        };
        int [][] ab = new int[2][3]; 
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    ab[i][j]+= a[i][k] * b[k][j];
                }
                System.out.print(ab[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
