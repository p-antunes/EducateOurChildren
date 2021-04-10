package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class people_game {

    @Id
    private int id_people_game;
    private int id_user;
    private int id_game;

    public people_game(int id_people_game, int id_user, int id_game) {
        this.id_people_game = id_people_game;
        this.id_user = id_user;
        this.id_game = id_game;
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
