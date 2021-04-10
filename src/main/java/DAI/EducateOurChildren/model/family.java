package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class family {

    @Id
    private int id_family;
    private String name;
    private String user_name;
    private String birth_day;
    private String city;
    private String county;
    private String postal_code;
    private String address;
    private String phone_nr;
    private int id_login;

    public family(int id_family, String name, String user_name, String birth_day, String city, String county, String postal_code, String address, String phone_nr, int id_login) {
        this.id_family = id_family;
        this.name = name;
        this.user_name = user_name;
        this.birth_day = birth_day;
        this.city = city;
        this.county = county;
        this.postal_code = postal_code;
        this.address = address;
        this.phone_nr = phone_nr;
        this.id_login = id_login;
    }

    public int getId_family() {
        return id_family;
    }

    public void setId_family(int id_family) {
        this.id_family = id_family;
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

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
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

    public String getPhone_nr() {
        return phone_nr;
    }

    public void setPhone_nr(String phone_nr) {
        this.phone_nr = phone_nr;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }
}
