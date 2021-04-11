package DAI.EducateOurChildren.model;

import javax.persistence.*;

@Entity(name = "material")
@Table(name = "material")

public class right {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int  id_right;

    @NotBlank(message = "Can't be blank")
    private String right;


    public right(int id_right, String right) {
        this.id_right = id_right;
        this.right = right;
    }

    public right() {

    }

    public void setId_right(int id_right) {
        this.id_right = id_right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public int getId_right() {
        return id_right;
    }

    public String getRight() {
        return right;
    }
}
