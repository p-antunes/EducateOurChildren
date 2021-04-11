package DAI.EducateOurChildren.controller;


import DAI.EducateOurChildren.model.child;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@RestController
@RequestMapping(path = "api/v1/child")
public class childController {

    @Autowired
    child child;

    @GetMapping

    @PostMaping("/child")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody child child) {
        try {
            // Activity Attributes

            int id_child = child.getId_child();
            String name  = child.getName();
            String user_name = child.getUser_name();

            Date end_data  = activity.getEnd_data();
            String title = activity.getTitle();
            String status = "Por aprovar";
            int spaces = activity.getSpaces();
            Institution institution = activity.getInstitution();
            if (init_data.compareTo(end_data) >0 || ! status.equals("Por aprovar")) {
                return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                        HttpStatus.BAD_REQUEST);
            } else {
                activityRepository.save(activity);
                return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Activity created", idActivity),
                        HttpStatus.CREATED);
            }
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }

}
