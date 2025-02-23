package task3.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private Long id;
    private String title;
    private String picture;
    private String text;
    /*private int countComments;
    private int countLikes;
    private List<String> tags =  new ArrayList<>();*/

    public Post(){}

    public Post(Long id, String title, String picture, String text /*int countComments, int countLikes, List<String> tags*/) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.text = text;
        /*this.countComments = countComments;
        this.countLikes = countLikes;
        this.tags = tags;*/
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPicture(){
        return this.picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }


}
