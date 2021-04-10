package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class prochild_collab {

    @Id
    private int id_prochild_collab;
    private String name;
    private String user_name;
    private String birth_date;
    private String city;
    private String county;
    private String postal_code;
    private String address;
    private int id_login;


    public prochild_collab(int id_prochild_collab, String name, String user_name, String birth_date, String city, String county, String postal_code, String address, int id_login) {
        this.id_prochild_collab = id_prochild_collab;
        this.name = name;
        this.user_name = user_name;
        this.birth_date = birth_date;
        this.city = city;
        this.county = county;
        this.postal_code = postal_code;
        this.address = address;
        this.id_login = id_login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_prochild_collab() {
        return id_prochild_collab;
    }

    public void setId_prochild_collab(int id_prochild_collab) {
        this.id_prochild_collab = id_prochild_collab;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
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
