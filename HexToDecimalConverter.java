
package com.mycompany.serie_iii_hexadecimal_a_decimal_josejuarez;


import java.util.Scanner;

public class HexToDecimalConverter {
    private String hexValue;

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public int convertToDecimal() {
        int decimalValue = 0;
        int base = 1;

        for (int i = hexValue.length() - 1; i >= 0; i--) {
            char digit = hexValue.charAt(i);
            int decimalDigit = Character.isDigit(digit) ? digit - '0' : digit - 'A' + 10;
            decimalValue += decimalDigit * base;
            base *= 16;
        }

        return decimalValue;
    }
 }