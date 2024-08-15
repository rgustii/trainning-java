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
public class try4 {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3},
            {3,4,5},
            {5,6,7},
        };
        int [][] b = {
            {7,6,5,4},
            {5,4,3,2},
            {4,3,2,1},
        };
        int [][] ab = new int [3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    ab[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(ab[i][j] + "\t");
            }
                System.out.println("");
            }
        }
    }

