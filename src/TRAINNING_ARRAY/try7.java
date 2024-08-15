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
public class try7 {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,4,5},
            {5,4,3,1},
        };
        int [][] b = {
            {5,6,7},
            {7,6,5},
            {8,7,6},
            {3,2,1},
        };
        int[][] ab = new int [2][3];
        
        for (int i = 0; i < 2; i++) { // ikutin angka int AB
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) { 
                // angka yg sama dari matrix diatas
                //contoh diatas adalah 2 x 4 dan 4 x 3
                // jadi tulis ordonya yg sama, jadi 4
                    ab [i][j] += a[i][k] * b[k][j];
                }
                System.out.print(ab [i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
