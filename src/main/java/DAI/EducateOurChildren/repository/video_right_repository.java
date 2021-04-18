package DAI.EducateOurChildren.repository;

import DAI.EducateOurChildren.model.video_right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface video_right_repository extends JpaRepository<video_right, Integer> {

    @Query("SELECT v FROM video_right v WHERE v.id_video = ?1")
    video_right findVideoRightById(int id_video);

    List<video_right> findAll();

    @Override
    void delete(video_right video_right);

}



