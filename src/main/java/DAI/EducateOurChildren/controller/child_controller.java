package DAI.EducateOurChildren.controller;
/*
import DAI.EducateOurChildren.model.child;
import DAI.EducateOurChildren.repository.child_repository;
import DAI.EducateOurChildren.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = "/api")
public class child_controller {

    private final child_repository ChildRepository;

    @Autowired
    public child_controller(child_repository childRepository) {
        ChildRepository = childRepository;
    }
    @GetMapping
    public List<child> listChild(){
        return ChildRepository.findAll();
    }
    @PostMapping("/child") // Creat account
    public ResponseEntity<ApiResponse> saveChild(@RequestBody CreateChild child) {
        try {
            // Activity Attributes
            int id_child  = child.getId_child();
            String contact = child.getContact();
            String email  = child.getEmail();
            String password  = child.getPassword();
            String confirmPassword = child.getConfirmPassword();
            String name= child.getName();
            Role role = child.getRole();
            int age = child.getAge();
            String address = child.getAddress();
            if (!confirmPassword.equals(password)) {
                return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Passwords não são iguais."),
                        HttpStatus.BAD_REQUEST);
            }
            if (loginRepository.existsByEmail(email)) {
                return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Email já em utilização."),
                        HttpStatus.BAD_REQUEST);
            }
            if (String.valueOf(password).length() < 6 || String.valueOf(password).length() > 24) {
                return new ResponseEntity<ApiResponse>(
                        new ApiResponse(false, "Password must contain between 6 to 24 characters"),
                        HttpStatus.BAD_REQUEST);
            }
            if(!(role.getIdRole() ==3)){
                return new ResponseEntity<ApiResponse>(
                        new ApiResponse(false, "Role inválido"),
                        HttpStatus.BAD_REQUEST);
            }

            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);
            // Create Login
            Login l = new Login(null,email,hashedPassword,role);
            loginRepository.save(l);

            // Create Child
            Child newChild = new Child(null,l,name,age,address,contact,idAvatar);
            childRepository.save(newChild);

            return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Account created",loginRepository.findDistinctByEmail(email).getIdLogin()),
                    HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Invalid data format"),
                    HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping(path = "{id_child}")
    public void deleteChild(@PathVariable("id_child") Integer id_child){
        child_service.deleteChild(id_child);
    }
}
*/