package DAI.EducateOurChildren.controller;

import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.model.video_right;
import DAI.EducateOurChildren.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping(value = "/api")
public class video_right_controller {


    @Autowired
    DAI.EducateOurChildren.repository.videorightRepository videorightRepository;

    @GetMapping

    @PostMapping("/video_right")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody video_right video_right) {
        try {
            // Activity Attributes
            int id_video= video_right.getId_video();

            String link_video = video_right.getLink_video();

            //Create video_right
            video_right newvideoright= new video_right(link_video);
            videorightRepository.save(newvideoright);

            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Direito inserido com sucesso!"),
                    HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }

    }
}
