package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.child;
import DAI.EducateOurChildren.model.login;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface child_repository extends JpaRepository<child, Integer> {

    child findDistinctByIdChild(int id_child);
    child findDistinctByLogin(login login);

    @Override
    List<child> findAll();


    @Override
    void delete(child child);


}
