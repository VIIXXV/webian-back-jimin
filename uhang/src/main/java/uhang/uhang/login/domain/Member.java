package uhang.uhang.login.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import uhang.uhang.posting.domain.Post;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "members")
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "memberId")
    private String memberEmail;
    private String memberPw;
    private int writeAuth;
    private Long studNum;
    @OneToMany(mappedBy = "memberId")
    private List<Post> posts = new ArrayList<>();

}