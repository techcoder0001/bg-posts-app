package tech.coder.io.bgpostsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.coder.io.bgpostsapp.model.PostContent;

@Repository
public interface PostContentRepository extends JpaRepository<PostContent, Long> {
}
