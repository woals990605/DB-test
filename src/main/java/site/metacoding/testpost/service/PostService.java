package site.metacoding.testpost.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testpost.domain.post.BoardTbl;
import site.metacoding.testpost.domain.post.PostRepository;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public List<BoardTbl> 글목록(String title) {
        if (title == null) {
            return postRepository.mSearch("");
        } else {
            return postRepository.mSearch(title);
        }
    }
}
