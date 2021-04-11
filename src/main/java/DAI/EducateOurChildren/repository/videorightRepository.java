package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.model.video_right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface videorightRepository extends JpaRepository<video_right, Long> {

    video_right findDistinctById_video(long id_video);


    List<video_right> findAll();

    @Transactional
    @Modifying
    @Query("UPDATE video_right A SET A.link_video= ?1 where A.id_video = ?2")
    void updateActivityStatus(String video_right ,Long id_video);

    @Override
    void delete(video_right video_right);



}