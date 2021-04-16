package DAI.EducateOurChildren.service;

import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.repository.Right_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class right_service {

    private static Right_repository RightRepository;

    @Autowired
    public right_service(Right_repository RightRepository) {
        this.RightRepository = RightRepository;
    }

    public static List<right> getRight(){
        return RightRepository.findAll();
    }

    public static void addNewRight(right right) {

        Optional<right> rightById = RightRepository.findRightById(right.getId_right());
        if (rightById.isPresent()) {
            throw new IllegalStateException("right taken")
        }

        RightRepository.save(right);
    }

    public static void deleteRight(Integer id_right) {
        boolean exists = RightRepository.existsById(id_right);
        if (!exists) {
            throw new IllegalStateException(
                    "right with id" + id_right + "does not exists");
        }
        RightRepository.deleteById(id_right);
    }
}