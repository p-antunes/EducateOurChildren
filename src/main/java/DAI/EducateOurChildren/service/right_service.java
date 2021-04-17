package DAI.EducateOurChildren.service;
/*
import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.repository.right_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class right_service {

    private static right_repository rightRepository;

    @Autowired
    public right_service(right_repository RightRepository) {
        rightRepository = RightRepository;
    }

    public static List<right> getRight(){
        return rightRepository.findAll();
    }

    public static void addNewRight(right right) {
        rightRepository.save(right);
    }

    public static void deleteRight(Integer id_right) {
        boolean exists = rightRepository.existsById(id_right);
        if (!exists) {
            throw new IllegalStateException(
                    "right with id" + id_right + "does not exists");
        }
        rightRepository.deleteById(id_right);
    }
}
*/