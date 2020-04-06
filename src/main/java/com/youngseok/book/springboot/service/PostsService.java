package com.youngseok.book.springboot.service;

import com.youngseok.book.springboot.domain.posts.Posts;
import com.youngseok.book.springboot.domain.posts.PostsRepository;
import com.youngseok.book.springboot.web.dto.PostsResponseDto;
import com.youngseok.book.springboot.web.dto.PostsSaveRequestDto;
import com.youngseok.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.pool.TypePool;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No Such User Exists. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;

    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No such user exists. id=" + id));
        return new PostsResponseDto(entity);
    }
}
