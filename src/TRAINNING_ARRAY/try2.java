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
public class try2 {
    public static void main(String[] args) {
        
            int [][] a = {
                {2,3,4},
                {5,6,7},
    
            };
            
            int [][] b = {
                {10,9,8},
                {7,6,5},
      
            };
            
            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print( a[i][j] - b[i][j]+"\t");
                }
                System.out.println("");
        }
    }
    
}
