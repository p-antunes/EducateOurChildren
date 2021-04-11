package DAI.EducateOurChildren.controller;


import DAI.EducateOurChildren.model.right;
import DAI.EducateOurChildren.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping(value = "/api")
    public class right_controller {

    @Autowired
    DAI.EducateOurChildren.repository.rightRepository rightRepository;

    @GetMapping

    @PostMapping("/right")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody right right) {
        try {
            // Activity Attributes
            int id_right= right.getId_right();

            String rights = right.getRight();

            //Create right
            right newright= new right(rights);
            rightRepository.save(newright);

            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Direito inserido com sucesso!"),
                    HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }

    }

}

