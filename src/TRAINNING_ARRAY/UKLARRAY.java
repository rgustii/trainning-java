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
public class UKLARRAY {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3},
            {1,2,3},
            {1,2,3},
        };
        int [][] b = {
            {1,2,3},
            {1,2,3},
            {1,2,3},
        };
        int [][] c = {
            {1,2,3},
            {2,1,2},
            {3,1,2},
        };
        int [][] ab = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                        ab [i][j] += a[i][k] * b[k][j];
                    }       
                     System.out.print(ab[i][j] + c[i][j]+  "\t");
                }
                System.out.println("");
            }        
        }
    }

