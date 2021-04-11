package DAI.EducateOurChildren.model;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "child")
@Table(name="child")

public class child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_child;

    @NotBlank(message = "Can't be blank")
    private String name;

    @NotBlank(message = "Can't be blank")
    private String user_name;
    private Date birth_date;
    private String city;
    private String county;
    private String postal_code;
    private String address;
    private String school;

    @ManyToOne
    @JoinColumn(name = "id_login", referencedColumnName = "id_login", nullable = false)
    private login login;

    public child(int id_child, String name, String user_name, Date birth_date, String city, String county, String postal_code, String address, String school, login login) {
        this.id_child = id_child;
        this.name = name;
        this.user_name = user_name;
        this.birth_date = birth_date;
        this.city = city;
        this.county = county;
        this.postal_code = postal_code;
        this.address = address;
        this.school = school;
        this.login = login;
    }

    public child() {

    }

    public int getId_child() {
        return id_child;
    }

    public void setId_child(int id_child) {
        this.id_child = id_child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public login getlogin() {
        return login;
    }

    public void setILogin(login login) {
        this.login = login;
    }
}
