package DAI.EducateOurChildren.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "opinion")
@Table(name = "opinion")

public class opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_opinion;
    private int id_user;

    public opinion(int id_opinion, int id_user) {
        this.id_opinion = id_opinion;
        this.id_user = id_user;
    }

    public opinion() {

    }

    public int getId_opinion() {
        return id_opinion;
    }

    public void setId_opinion(int id_opinion) {
        this.id_opinion = id_opinion;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
