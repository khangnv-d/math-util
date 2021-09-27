/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nampv.mathutil.main;

import com.nampv.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
 
    public static void main(String[] args) {
        //test manual, đưa daat, gọi hàm check
        // so sánh expected vs actual
        //tất cả phải compare bằng mắt cho từng trường hợp
        System.out.println("0! = 1? : "+MathUtil.getFactorial(0));
    }
}
