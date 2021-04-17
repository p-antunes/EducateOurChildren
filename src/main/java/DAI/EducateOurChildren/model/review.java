package DAI.EducateOurChildren.model;

import javax.persistence.*;

@Entity(name = "review")
@Table(name = "review")

public class review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_review;
    private String review;

    public review(int id_review, String review) {
        this.id_review = id_review;
        this.review = review;
    }

    public review() {

    }

    public int getId_review() {
        return id_review;
    }

    public void setId_review(int id_review) {
        this.id_review = id_review;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
