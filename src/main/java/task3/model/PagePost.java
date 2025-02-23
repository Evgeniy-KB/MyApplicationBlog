package task3.model;

import java.util.ArrayList;
import java.util.List;

public class PagePost {
    private Long id;
    private String title;
    private String picture;
    private String text;
    private List<String> comments = new ArrayList<>();

    public PagePost(Long id, String title, String picture, String text, List<String> comments) {
        //this.super();
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.text = text;

    }




}
