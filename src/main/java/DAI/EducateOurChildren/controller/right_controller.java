package DAI.EducateOurChildren.controller;

/*
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
*/


import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.response.ApiResponse;
import DAI.EducateOurChildren.repository.right_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class right_controller {
    @Autowired
    right_repository RightRepository;

    @GetMapping("/rights")
    public List<right> listRight() {

        return RightRepository.findAll();
    }

    @GetMapping("/rights/{id_right}")
    public right findRight(@PathVariable int id_right) {

        return RightRepository.findRightById(id_right);
    }


    @PostMapping("/rights")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody right right) {
        try {
            int id_right = right.getId_right();
            String rig = right.getRight();
            RightRepository.save(right);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Right created"),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/rights/{id_right}")
    public ResponseEntity<ApiResponse> deleteRight(@PathVariable(value = "id_right") int id_right) {
        try {
            right rig = RightRepository.findRightById(id_right);
            RightRepository.delete(rig);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Right deleted."),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
