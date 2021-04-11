package DAI.EducateOurChildren.model;

import javax.persistence.*;

@Entity(name = "video_right")
@Table(name = "video_right")

public class video_right {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Can't be blank")
    private int id_video;

    @NotBlank(message = "Can't be blank")
    private String link_video;

    public video_right(int id_video, String link_video) {
        this.id_video = id_video;
        this.link_video = link_video;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public String getLink_video() {
        return link_video;
    }

    public void setLink_video(String link_video) {
        this.link_vdeo = link_video;
    }
}
