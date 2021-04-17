package DAI.EducateOurChildren.service;

import DAI.EducateOurChildren.model.video_right;
import DAI.EducateOurChildren.repository.video_right_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class video_right_service {

    private static video_right_repository VideoRightRepository;

    @Autowired
    public video_right_service(video_right_repository videoRightRepository) {
        VideoRightRepository = videoRightRepository;
    }

    public static List<video_right> getVideoRight(){
        return VideoRightRepository.findAll();
    }

    public static void addNewVideoRight(video_right video_right) {
        VideoRightRepository.save(video_right);
    }

    public static void deleteVideoRight(Integer id_video) {
        boolean exists = VideoRightRepository.existsById(id_video);
        if (!exists) {
            throw new IllegalStateException(
                    "right with id" + id_video + "does not exists");
        }
        VideoRightRepository.deleteById(id_video);
    }
}
