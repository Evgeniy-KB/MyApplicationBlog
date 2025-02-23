package task3.model;

import java.util.ArrayList;
import java.util.List;

public class FeedPost{
    private Long id;
    private String title;
    private String picture;
    private String text;
    private int countComments;
    private int countLikes;
    private List<String> tags =  new ArrayList<>();

    public FeedPost(Long id, String title, String picture, String text, int countComments, int countLikes, List<String> tags) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.text = text;
        this.countComments = countComments;
        this.countLikes = countLikes;
        this.tags = tags;
    }




}
