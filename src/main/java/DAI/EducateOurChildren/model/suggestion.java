package DAI.EducateOurChildren.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class suggestion {

    @Id
    private int id_suggestion;
    private String suggestion;

    public suggestion(int id_suggestion, String suggestion) {
        this.id_suggestion = id_suggestion;
        this.suggestion = suggestion;
    }

    public suggestion() {

    }

    public int getId_suggestion() {
        return id_suggestion;
    }

    public void setId_suggestion(int id_suggestion) {
        this.id_suggestion = id_suggestion;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }


