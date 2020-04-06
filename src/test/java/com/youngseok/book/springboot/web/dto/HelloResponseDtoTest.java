package com.youngseok.book.springboot.web.dto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloResponseDtoTest {

    @Test
    public void test_lombok(){
        String name = "name";
        int amount = 50;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertEquals(name, dto.getName());
        assertEquals(amount, dto.getAmount());
    }



}