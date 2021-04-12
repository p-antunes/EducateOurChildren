package DAI.EducateOurChildren.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "material")
@Table(name = "material")

public class material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_material;

    private int id_user;

    public material(int id_material, int id_user) {
        this.id_material = id_material;
        this.id_user = id_user;
    }

    public material() {

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
