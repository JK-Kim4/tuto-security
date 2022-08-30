package com.tutorial.tutosecurity.web.post;

import com.tutorial.tutosecurity.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private PostsService service;

}
