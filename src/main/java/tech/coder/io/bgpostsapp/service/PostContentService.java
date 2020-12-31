package tech.coder.io.bgpostsapp.service;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.coder.io.bgpostsapp.model.PostContent;
import tech.coder.io.bgpostsapp.repository.PostContentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostContentService {

    @Autowired
    private PostContentRepository postContentRepository;

    public List<PostContent> getAllPosts(){
        return postContentRepository.findAll();
    }

    public PostContent getPostbyId(Long id){
        Optional<PostContent> optionalPostContent = postContentRepository.findById(id);
        return optionalPostContent.get();
    }

    public PostContent savePost(PostContent postContent){
        return postContentRepository.save(postContent);
    }

    public void deletePost(Long id){
        Optional<PostContent> optionalPostContent = postContentRepository.findById(id);
        postContentRepository.delete(optionalPostContent.get());
    }

    public PostContent updatePost(PostContent postContent, Long id){
        Optional<PostContent> optionalPostContent = postContentRepository.findById(id);
        if (optionalPostContent.isPresent()){
            if (postContent.getPostId() != 0 || postContent.getPostId() != null){
                optionalPostContent.get().setPostId(postContent.getPostId());
            }
            if (postContent.getPostTitle() != null){
                optionalPostContent.get().setPostTitle(postContent.getPostTitle());
            }
            if (postContent.getPostDate() != null){
                optionalPostContent.get().setPostDate(postContent.getPostDate());
            }
            if (postContent.getPostBody() != null){
                optionalPostContent.get().setPostBody(postContent.getPostBody());
            }
        }
        return postContentRepository.save(optionalPostContent.get());

    }
}
