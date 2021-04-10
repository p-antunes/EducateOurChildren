package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class institution {

    @Id
    private int id_institution;
    private String name;
    private String user_name;
    private String email;
    private String phone_nr;
    private String city;
    private String county;
    private String postal_code;
    private String address;
    private int id_login;


    public institution(int id_institution, String name, String user_name, String email, String phone_nr, String city, String county, String postal_code, String address, int id_login) {
        this.id_institution = id_institution;
        this.name = name;
        this.user_name = user_name;
        this.email = email;
        this.phone_nr = phone_nr;
        this.city = city;
        this.county = county;
        this.postal_code = postal_code;
        this.address = address;
        this.id_login = id_login;
    }

    public int getId_institution() {
        return id_institution;
    }

    public void setId_institution(int id_institution) {
        this.id_institution = id_institution;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_nr() {
        return phone_nr;
    }

    public void setPhone_nr(String phone_nr) {
        this.phone_nr = phone_nr;
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

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }
}
