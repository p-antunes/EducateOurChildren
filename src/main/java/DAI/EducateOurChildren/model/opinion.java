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
    private String opinion;


    public opinion(@NotBlank(message = "Can't be blank") int id_opinion, String opinion) {
        this.id_opinion = id_opinion;
        this.opinion = opinion;
    }

    public opinion() {

    }

    public int getId_opinion() {
        return id_opinion;
    }

    public void setId_opinion(int id_opinion) {
        this.id_opinion = id_opinion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
