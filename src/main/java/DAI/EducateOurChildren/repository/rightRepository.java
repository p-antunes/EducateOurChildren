package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface rightRepository extends JpaRepository<right, Long> {

    right findDistinctById_right(long id_right);


    List<right> findAll();

    @Transactional
    @Modifying
    @Query("UPDATE right A SET A.right= ?1 where A.id_right = ?2")
    void updateActivityStatus(String right ,Long id_right);

    @Override
    void delete(right right);



}
