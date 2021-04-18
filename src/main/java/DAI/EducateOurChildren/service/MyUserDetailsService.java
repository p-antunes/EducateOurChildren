package DAI.EducateOurChildren.service;

import DAI.EducateOurChildren.model.login;
import DAI.EducateOurChildren.repository.login_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    login_repository loginRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Let people login with or email
        try {
            login user = loginRepository.findDistinctByEmail(email);
            return UserPrincipal.create(user);
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found with email : " + email);
        }
    }

    // This method is used by JWTAuthenticationFilter
    @Transactional
    public UserDetails loadUserById(Long id_login) {
        try {
            login user = loginRepository.findDistinctByIdLogin(id_login);
            return UserPrincipal.create(user);
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found with id : " + id_login);
        }
    }
}
