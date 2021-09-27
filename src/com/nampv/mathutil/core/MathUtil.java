/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nampv.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    
    //write finction calculation
    // n! = 1.2.3.4.5...n
    //0! = 1! = 1
    //21! tran kieu long
    //<0 ! can not calcu
    
    //Using TDD
    
    public static long getFactorial(int n){
        if(n<0 || n>21)
            throw new IllegalArgumentException("n must be 0-20");
        if(n==0 || n== 1)
            return 1;
        long product =1;
        for(int i = 2; i<=n ; i++){
            product *= i;
        }
        return product;
    }
  
}
