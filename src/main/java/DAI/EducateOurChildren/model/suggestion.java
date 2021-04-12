package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class suggestion {

    @Id
    private int id_material;
    private int id_user;

    public suggestion(int id_material, int id_user) {
        this.id_material = id_material;
        this.id_user = id_user;
    }

    public suggestion() {

    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
