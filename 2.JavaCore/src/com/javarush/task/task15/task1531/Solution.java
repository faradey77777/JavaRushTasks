package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

    }

//    public static BigDecimal factorial(BigDecimal n) {
//      if(n.compareTo(BigDecimal.ZERO) > 0){
//         BigDecimal result = n.multiply(factorial(n.subtract(BigDecimal.ONE)));
//         return result;
//
//          }
//      return null;
//      }
//      if( n.compareTo(BigDecimal.ZERO) == 0)
//          System.out.println("1");
//
//      if(n.compareTo(BigDecimal.ZERO)<0) {
//          System.out.println("0");
//      }
    }



