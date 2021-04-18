package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.opinion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface opinion_repository extends JpaRepository<opinion, Integer> {

    @Query("SELECT v FROM opinion v WHERE v.id_opinion = ?1")
    opinion findOpinionById(int id_opinion);

    List<opinion> findAll();

    @Override
    void delete(opinion opinion);
}
