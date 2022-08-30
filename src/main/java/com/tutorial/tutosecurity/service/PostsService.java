package com.tutorial.tutosecurity.service;

import com.tutorial.tutosecurity.domain.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository repository;

}
