package task3.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import task3.model.Post;

import java.util.List;

@Repository
public class JdbcNativePostRepository implements PostRepository{

    private final JdbcTemplate jdbcTemplate;

    public JdbcNativePostRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Post> findAll() {
        return jdbcTemplate.query(
                "select id, title, picture, text from posts",
                (rs, rowNum) -> new Post(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("picture"),
                        rs.getString("text")
                ));
        //.stream().sorted((p1, p2) -> Long.compare(p2.getId(), p1.getId())).toList()
    }

    @Override
    public void save(Post post) {
        jdbcTemplate.update("insert into posts(title, picture, text) values(?, ?, ?)",
                post.getTitle(), post.getPicture(), post.getText() );
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update("delete from posts where id = ?", id);
    }

}
