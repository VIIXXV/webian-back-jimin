//package uhang.uhang.login.domain;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import uhang.uhang.posting.domain.entity.Post;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity(name = "members")
//@Getter
//public class Member {
//    @Id
//    @GeneratedValue
//    @Column(name = "member_id")
//    private String memberEmail;
//    private String memberPw;
//    private int writeAuth;
//    private Long studNum;
//    @OneToMany(mappedBy = "memberId")
//    private List<Post> posts = new ArrayList<>();
//
//}