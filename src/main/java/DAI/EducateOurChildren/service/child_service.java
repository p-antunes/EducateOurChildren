package DAI.EducateOurChildren.service;
/*
import DAI.EducateOurChildren.model.child;
import DAI.EducateOurChildren.repository.child_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class child_service {

    private static child_repository ChildRepository;

    @Autowired
    public child_service(child_repository childRepository) {
        ChildRepository = childRepository;
    }

    public static List<child> getChild(){
        return ChildRepository.findAll();
    }

    public static void addNewChild(child child) {
        ChildRepository.save(child);
    }

    public static void deleteChild(Integer id_child) {
        boolean exists = ChildRepository.existsById(id_child);
        if (!exists) {
            throw new IllegalStateException(
                    "right with id" + id_child + "does not exists");
        }
        ChildRepository.deleteById(id_child);
    }
}
*/