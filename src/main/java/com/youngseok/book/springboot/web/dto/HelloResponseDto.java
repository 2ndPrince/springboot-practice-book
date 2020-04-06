package com.youngseok.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // Only for final // Issue with gradle 5 version. Downgrading fixes the issue.
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
