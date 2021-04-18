package DAI.EducateOurChildren.model;

import javax.persistence.*;

@Entity(name = "role")
@Table(name = "role")

public class role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_role;
    private String role_name;

    public role(int id_role, String role_name) {
        this.id_role = id_role;
        this.role_name = role_name;
    }

    public role() {
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}