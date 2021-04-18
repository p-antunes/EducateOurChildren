package DAI.EducateOurChildren.controller;

import DAI.EducateOurChildren.model.review;
import DAI.EducateOurChildren.response.ApiResponse;
import DAI.EducateOurChildren.repository.review_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")


public class review_controller {
    @Autowired
    review_repository ReviewRepository;

    @GetMapping("/review")
    public List<review> listreview() {

        return ReviewRepository.findAll();
    }

    @GetMapping("/review/{id_review}")
    public review findreview(@PathVariable int id_review) {

        return ReviewRepository.findReviewById(id_review);
    }


    @PostMapping("/review")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody review review) {
        try {
            int id_review = review.getId_review();
            String rev = review.getReview();
            ReviewRepository.save(review);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "review created"),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/review/{id_review}")
    public ResponseEntity<ApiResponse> deletereview(@PathVariable(value = "id_review") int id_review) {
        try {
            review rev = ReviewRepository.findReviewById(id_review);
            ReviewRepository.delete(rev);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "review deleted."),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
