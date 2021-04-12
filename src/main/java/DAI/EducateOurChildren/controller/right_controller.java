package DAI.EducateOurChildren.controller;


import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.service.right_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class right_controller {

    private final right_service RightService;

    @Autowired
    public right_controller(right_service rightService) {
        RightService = rightService;
    }

    @GetMapping
    public List<right> getRight(){
        return right_service.getRight();
    }

    @PostMapping
    public void registerNewRight(@RequestBody right right){
        right_service.addNewRight(right);
    }

    @DeleteMapping(path = "{id_right")
    public void deleteRight(@PathVariable("id_right") Integer id_right){
        right_service.deleteRight(id_right);
    }

}

