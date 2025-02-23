package task3.repository;

import task3.model.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();

    void save(Post post);

    void deleteById(Long id);
}
