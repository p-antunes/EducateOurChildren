package DAI.EducateOurChildren.controller;


import DAI.EducateOurChildren.model.video_right;
import DAI.EducateOurChildren.service.video_right_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class video_right_controller {

    private final video_right_service VideoRightService;

    @Autowired
    public video_right_controller(video_right_service videoRightService) {
        VideoRightService = videoRightService;
    }

    @GetMapping
    public List<video_right> getVideoRight(){
        return video_right_service.getVideoRight();
}

    @PostMapping
    public void registerNewVideoRight(@RequestBody video_right video_right){
        video_right_service.addNewVideoRight(video_right);
    }

    @DeleteMapping(path = "{id_video}")
    public void deleteVideoRight(@PathVariable("id_video") Integer id_video){
        video_right_service.deleteVideoRight(id_video);
    }
}
