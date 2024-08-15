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
public class try6 {
    public static void main(String[] args) {
        int[][] a =  {
            {1,2},
            {2,3},
            {3,4},
            {4,5},
        };
        int[][] b = {
            {9,8},
            {8,7},
            {7,6},
            {6,5},
        };
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + b[i][j] +"");
            }
            System.out.println("");
        }
    }
    
}
