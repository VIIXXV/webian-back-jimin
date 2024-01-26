package uhang.uhang.posting.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import uhang.uhang.login.domain.Member;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "posts")
@Getter @Setter
public class Post {
    @Id @GeneratedValue
    @Column(name = "eventId")
    private String eventTitle;
    private LocalTime eventTime;
    private LocalDate eventDate;
    private String eventLoc;
    private int eventType;
    private Long eventText;
    private Long imageUrl;
    private int timeStamp;
    @ManyToOne
    @JoinColumn(name="memberId")
    private Member member;
    private int totalLike;

}
