package DAI.EducateOurChildren.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "game_people")
@Table(name = "game_people")

public class people_game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_people_game;


    @NotBlank(message = "Can't be blank")
    private int id_user;


    @NotBlank(message = "Can't be blank")
    private int id_game;

    public people_game(int id_people_game, int id_user, int id_game) {
        this.id_people_game = id_people_game;
        this.id_user = id_user;
        this.id_game = id_game;
    }

    public people_game() {

    }

    public int getId_people_game() {
        return id_people_game;
    }

    public void setId_people_game(int id_people_game) {
        this.id_people_game = id_people_game;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }
}
