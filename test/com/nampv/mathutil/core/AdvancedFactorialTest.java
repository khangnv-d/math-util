/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nampv.mathutil.core;

import static com.nampv.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //ta viet ki thuat moi,
    //tach data ra hẳn các lệnh kiểm tra hàm
    //dât này ta có thể đặt file .txt, .csv, excel, databse
    //@Before, hàm tải data
    //input, output/ expected là những cặp
    //nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều
    //mảng 2 chiều này sẽ đc nạp từ .txt, db
    //hoặc tại đây
    
    @Parameters
    public static Object[][] initData() {
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120}
        };
    }
    
    //ta cần map 2 cột vào 2 biến để lát nhồi/feed chúng
    //hàm checkFactorial, ta gọi là testing kiểu tham số hóa
    // parameterized testing
    
    //input
    @Parameter(value = 0)
    public int input;
    
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell() {

        assertEquals(expected, getFactorial(input));
        

    }
       
}
