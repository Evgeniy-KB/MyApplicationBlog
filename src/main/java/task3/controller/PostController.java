package task3.controller;

import org.springframework.ui.Model;
import task3.model.Post;
import task3.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping // GET запрос /posts
    public String posts(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);

        return "posts"; // Возвращаем название шаблона — posts.html
    }

    @PostMapping
    public String save(@ModelAttribute Post post) {
        postService.save(post);

        return "redirect:/posts"; // Возвращаем страницу, чтобы она перезагрузилась
    }

    @PostMapping(value = "/{id}", params = "_method=delete")
    public String delete(@PathVariable(name = "id") Long id) {
        postService.deleteById(id);

        return "redirect:/posts";
    }
}
