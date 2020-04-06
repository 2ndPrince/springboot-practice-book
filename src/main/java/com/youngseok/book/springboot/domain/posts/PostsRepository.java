package com.youngseok.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// In MyBatis, it's called Dao. In JPA, it's called Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
