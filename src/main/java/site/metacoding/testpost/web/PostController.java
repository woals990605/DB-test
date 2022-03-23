package site.metacoding.testpost.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testpost.domain.post.BoardTbl;
import site.metacoding.testpost.domain.post.PostRepository;
import site.metacoding.testpost.service.PostService;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @GetMapping({ "/", "/post/list" })
    public String list(Model model, String title) {

        List<BoardTbl> postBoard = postService.글목록(title);
        // System.out.println(title);

        model.addAttribute("BoardTbl", postBoard);

        return "/post/list";
    }
}
