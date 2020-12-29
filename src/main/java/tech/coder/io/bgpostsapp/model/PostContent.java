package tech.coder.io.bgpostsapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_content")
public class PostContent {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long post_content_id;
    @Id
    @Column(name = "postId")
    private Long postId;
    @Column(name = "postTitle")
    private String postTitle;
    @Column(name = "postDate")
    private Date postDate;
    @Column(name = "postBody")
    private String postBody;

    public Long getPost_content_id() {
        return post_content_id;
    }

    public void setPost_content_id(Long post_content_id) {
        this.post_content_id = post_content_id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }
}
