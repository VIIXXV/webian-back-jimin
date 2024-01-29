package uhang.uhang.posting.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
//import uhang.uhang.login.domain.Member;
import uhang.uhang.posting.domain.entity.Post;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostDto {
    private Long eventId;

    private String eventTitle;
    private LocalTime eventTime;
    private LocalDate eventDate;
    private String eventLoc;
    private int eventType;
    private String eventText;
    private URI imageUrl;
    private LocalDateTime timeStamp;
//    private Member member;
    private Integer totalLike;

    // member builder에도 추가해주기
    @Builder
    public PostDto(Long eventId, String eventTitle, LocalTime eventTime, LocalDate eventDate,
                   String eventLoc, int eventType, String eventText, URI imageUrl,
                   LocalDateTime timeStamp, Integer totalLike) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventLoc = eventLoc;
        this.eventType = eventType;
        this.eventText = eventText;
        this.imageUrl = imageUrl;
        this.timeStamp = timeStamp;
//        this.member = member;
        this.totalLike = totalLike;

    }
}
