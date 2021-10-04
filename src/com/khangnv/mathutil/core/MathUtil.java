/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khangnv.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    
    // Recursion- de quy, goi lai chinh minh voi quy mo khac
    //n! = n * (n-1)!
    public static long getFactorial(int n) {
         if(n<0 || n>21)
            throw new IllegalArgumentException("n must be 0-20");
        if(n==0 || n== 1)
            return 1;// diem dung
        return n * getFactorial(n - 1);
        
    }
    
    
    //Using TDD
    
//    public static long getFactorial(int n){
//        if(n<0 || n>21)
//            throw new IllegalArgumentException("n must be 0-20");
//        if(n==0 || n== 1)
//            return 1;
//        long product =1;
//        for(int i = 2; i<=n ; i++){
//            product *= i;
//        }
//        return product;
//    }
  
}
