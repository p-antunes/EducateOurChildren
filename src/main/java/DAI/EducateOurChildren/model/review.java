package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class review {

    @Id
    private int  id_review;
    private int id_user;

    public review(int id_review, int id_user) {
        this.id_review = id_review;
        this.id_user = id_user;
    }

    public int getId_review() {
        return id_review;
    }

    public void setId_review(int id_review) {
        this.id_review = id_review;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
