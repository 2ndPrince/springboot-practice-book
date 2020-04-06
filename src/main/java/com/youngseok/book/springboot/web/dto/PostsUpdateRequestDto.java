package com.youngseok.book.springboot.web.dto;

import javafx.scene.chart.ChartBuilder;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsUpdateRequestDto {

    public String title;
    public String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
