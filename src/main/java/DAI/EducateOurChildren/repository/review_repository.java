package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface review_repository extends JpaRepository<review, Integer> {
    @Query("SELECT v FROM review v WHERE v.id_review = ?1")
    review findReviewById(int id_review);

    List<review> findAll();

    @Override
    void delete(review review);
}
