package com.github.alina.session_8_array_linkedlist.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge_09Test {
    @Test
    public void shouldCovertBinaryToDecimalSuccesfull(){
        Challenge_09 convertor = new Challenge_09();
        int decimal = convertor.convertBinaryToDecimal("1011");
       assertEquals(11, decimal);
    }

}