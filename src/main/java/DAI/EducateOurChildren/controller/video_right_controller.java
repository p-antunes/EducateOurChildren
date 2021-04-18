/*package DAI.EducateOurChildren.controller;


import DAI.EducateOurChildren.model.video_right;
import DAI.EducateOurChildren.models.AuthenticationRequest;
import DAI.EducateOurChildren.models.AuthenticationResponse;
import DAI.EducateOurChildren.service.MyUserDetailsService;
import DAI.EducateOurChildren.service.video_right_service;
import DAI.EducateOurChildren.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/api")
public class video_right_controller {

    private final video_right_service VideoRightService;

    @Autowired
    public video_right_controller(video_right_service videoRightService) {
        VideoRightService = videoRightService;
    }

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

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

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }

}*/
