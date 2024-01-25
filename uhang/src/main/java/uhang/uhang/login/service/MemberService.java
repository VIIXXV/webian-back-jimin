//package uhang.uhang.login.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MemberService {
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    public Member registerMember(String email, String password, String studentId) {
//        Member member = new Member();
//        member.setEmail(email);
//        member.setPassword(password);
//        member.setStudentId(studentId);
//
//        // auth는 자동으로 1이 할당됨
//
//        return memberRepository.save(member);
//    }
//
//    public Member login(String email, String password) {
//        return memberRepository.findByEmailAndPassword(email, password);
//    }
//}
