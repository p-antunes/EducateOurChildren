package DAI.EducateOurChildren.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import DAI.EducateOurChildren.model.chat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface chatRepository extends JpaRepository <chat, Integer> {

    @Query()

}
