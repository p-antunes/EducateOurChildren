/*package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface login_repository extends JpaRepository<login, Long> {
    login findDistinctByIdLogin(long id_login);

    login findDistinctByEmail(String email);

    @Override
    List<login> findAll();

    Boolean existsByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE login SET email = ?1 WHERE id_login = ?2")
    void updateLoginEmail(String email, Long id_login);

    @Transactional
    @Modifying
    @Query("UPDATE login SET password = ?1 WHERE id_login = ?2")
    void updateLoginPassword(String password, Long id_login);
}*/
