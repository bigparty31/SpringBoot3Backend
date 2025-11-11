package bigparty.shop.springbootdeveloper.service;

import bigparty.shop.springbootdeveloper.domain.Article;
import bigparty.shop.springbootdeveloper.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import bigparty.shop.springbootdeveloper.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
