package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface suggestion_repository extends JpaRepository<suggestion, Integer> {

    @Query("SELECT v FROM suggestion v WHERE v.id_suggestion = ?1")
    suggestion findSuggestionById(int id_suggestion);

    List<suggestion> findAll();

    @Override
    void delete(suggestion suggestion);
}
