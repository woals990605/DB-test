package site.metacoding.testpost.domain.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<BoardTbl, Integer> {

    @Query(value = "SELECT * FROM boardTbl WHERE title like %:title%", nativeQuery = true)
    List<BoardTbl> mSearch(@Param("title") String title);

}
