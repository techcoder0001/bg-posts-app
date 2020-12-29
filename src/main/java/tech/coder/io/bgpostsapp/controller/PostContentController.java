package tech.coder.io.bgpostsapp.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.coder.io.bgpostsapp.model.PostContent;
import tech.coder.io.bgpostsapp.service.PostContentService;

import java.util.List;

@RestController
public class PostContentController {

    @Autowired
    private PostContentService postContentService;

    @GetMapping("/getallposts")
    public List<PostContent> getAllPosts(){
        return postContentService.getAllPosts();
    }

    @GetMapping("/getpostbyid/{id}")
    public PostContent getPostbyId(@PathVariable Long id){
        return postContentService.getPostbyId(id);
    }

    @PostMapping("/savepost")
    public PostContent savePost(@RequestBody PostContent postContent){
        return postContentService.savePost(postContent);
    }

    @DeleteMapping("/deletepost/{id}")
    public void deletePost(@PathVariable Long id){
        postContentService.deletePost(id);
    }

    @PutMapping("/updatepost/{id}")
    public PostContent updatePost(@RequestBody PostContent postContent, @PathVariable Long id){
        return postContentService.updatePost(postContent, id);
    }
}
