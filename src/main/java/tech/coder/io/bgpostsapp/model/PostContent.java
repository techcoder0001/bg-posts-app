package tech.coder.io.bgpostsapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_content")
public class PostContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Long postId;
    @Column(name = "post_title")
    private String postTitle;
    @Column(name = "post_date")
    private Date postDate;
    @Column(name = "post_body")
    private String postBody;

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
