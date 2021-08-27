/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author pawse
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n value as integer: ");
        int number  = Integer.parseInt(scanner.nextLine());
        scanner.close();
      
        //System.out.print(calculateLoop(number));
        System.out.print(calcRecursion(number));
    }
    
    private static int calcRecursion(int n ){
        if (n == 1){
           return 1;
        } 
        return n * calcRecursion(n -1);
    }
    
    private static int calcloop(int n){
        int f = n;
        
        for (int i = 1; i < n; i++){
            f *= i;
        }
        return f;
        
    }
    
    
    
    private static int calculateLoop(int n){
        int factorial = 1;
        for (int i = n; i >= 1; --i){
            factorial *= i;
        }
        return factorial;
    }
}
