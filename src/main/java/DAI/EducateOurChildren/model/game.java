package DAI.EducateOurChildren.model;

import javax.persistence.*;

@Entity(name = "game")
@Table(name = "game")

public class game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_game;


    public game(int id_game) {
        this.id_game = id_game;
    }

    public game() {

    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }
}
