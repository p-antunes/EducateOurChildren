package DAI.EducateOurChildren.controller;

import DAI.EducateOurChildren.model.suggestion;
import DAI.EducateOurChildren.payload.response.ApiResponse;
import DAI.EducateOurChildren.repository.suggestion_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class suggestion_controller {
    @Autowired
    suggestion_repository SuggestionRepository;

    @GetMapping("/suggestion")
    public List<suggestion> listSuggestion() {

        return SuggestionRepository.findAll();
    }

    @GetMapping("/suggestion/{id_suggestion}")
    public suggestion findSuggestion(@PathVariable int id_suggestion) {

        return SuggestionRespository.findSuggestionByid(id_suggestion);
    }


    @PostMapping("/suggestion")
    public ResponseEntity<ApiResponse> saveActivity(@RequestBody suggestion suggestion) {
        try {
            int id_suggestion = suggestion.getid_suggestion();
            String sug = suggestion.getsuggestion();
            SuggestionRespository.save(suggestion);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "suggestion created"),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/suggestion/{id_suggestion}")
    public ResponseEntity<ApiResponse> deleteSuggestion(@PathVariable(value = "id_suggestion") int id_suggestion) {
        try {
            suggestion sug = SuggestionRespository.findSuggestionByid(id_suggestion);
            SuggestionRespository.delete(sug);
            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "suggestion deleted."),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
