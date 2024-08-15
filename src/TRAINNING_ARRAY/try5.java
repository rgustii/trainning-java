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
public class try5 {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3,4},
            {4,3,2,1},
        };
        int [][] b = {
            {5,6,7,8},
            {8,7,6,5},
        };
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
