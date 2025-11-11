package bigparty.shop.springbootdeveloper.service;

import bigparty.shop.springbootdeveloper.domain.Article;
import bigparty.shop.springbootdeveloper.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import bigparty.shop.springbootdeveloper.repository.BlogRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(()-> new IllegalStateException("not found" + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }
}
