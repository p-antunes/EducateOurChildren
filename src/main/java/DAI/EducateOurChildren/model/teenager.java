package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class teenager {

    @Id
    private int id_teenager;
    private String name;
    private String user_name;
    private String birth_date;
    private String phone_nr;
    private String city;
    private String county;
    private String postal_code;
    private String address;
    private String school;
    private int id_login;


    public teenager(int id_teenager, String name, String user_name, String birth_date, String phone_nr, String city, String county, String postal_code, String address, String school, int id_login) {
        this.id_teenager = id_teenager;
        this.name = name;
        this.user_name = user_name;
        this.birth_date = birth_date;
        this.phone_nr = phone_nr;
        this.city = city;
        this.county = county;
        this.postal_code = postal_code;
        this.address = address;
        this.school = school;
        this.id_login = id_login;
    }


    public int getId_teenager() {
        return id_teenager;
    }

    public void setId_teenager(int id_teenager) {
        this.id_teenager = id_teenager;
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

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }
}
