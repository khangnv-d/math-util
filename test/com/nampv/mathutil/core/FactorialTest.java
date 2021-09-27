/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nampv.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class FactorialTest {

    @Test
    public void checkFactorialGivenRightArgumentReturnWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));

    }

    //check xem co ngoai le hay khong
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        //can not use assertEquals cuz we dont have value to compare
        //chi co the thay no xuat hien hay khong
        MathUtil.getFactorial(-5);
    }
}
