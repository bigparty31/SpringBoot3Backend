package bigparty.shop.springbootdeveloper.repository;

import bigparty.shop.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article,Long> {
}
