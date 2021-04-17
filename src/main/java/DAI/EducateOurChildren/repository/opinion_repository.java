package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.suggestion;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface opinion_repository {

    @Query("SELECT v FROM opinion v WHERE v.id_opinion = ?1")
    opinion findOpinionById(int id_opinion);

    List<suggestion> findAll();

    @Override
    void delete(suggestion suggestion);
}
