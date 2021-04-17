package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface right_repository extends JpaRepository<right, Integer> {

    @Query("SELECT v FROM right v WHERE v.id_right = ?1")
    right findRightById(int id_right);

    List<right> findAll();

    @Override
    void delete(right right);
}
