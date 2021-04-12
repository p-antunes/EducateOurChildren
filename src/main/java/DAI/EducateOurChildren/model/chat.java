package DAI.EducateOurChildren.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity(name = "chat")
@Table(name="chat")

public class chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat")
    private int id_chat;

    @Column(name = "id_user")
    private int id_user;

    public chat(int id_chat, int id_user) {
        this.id_chat = id_chat;
        this.id_user = id_user;
    }

    public chat() {

    }

    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
