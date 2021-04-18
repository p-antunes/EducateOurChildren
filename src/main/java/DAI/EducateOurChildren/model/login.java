package DAI.EducateOurChildren.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity(name = "login")
@Table(name = "login")

public class login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_login;

    @Column(unique = true)
    @Email(message = "Insert a valid email")
    private String email;

    @NotBlank(message = "Can't be blank")
    //@Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number")
    private String password;

    @OneToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id_role", nullable = true)
    private role role;

    public login(int id_login,/* @Email(message = "Insert a valid email")*/ String email, /*@NotBlank(message = "Can't be blank") @Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number")*/ String password) {
        this.id_login = id_login;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public login() {

    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public role getRole() {
        return role;
    }

    public void setRole(role role) {
        this.role = role;
    }
}
