//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/members")
//public class MemberController {
//
//    @Autowired
//    private MemberService memberService;
//
//    @PostMapping("/register")
//    public Member registerMember(@RequestBody MemberRegistrationRequest request) {
//        return memberService.registerMember(request.getEmail(), request.getPassword(), request.getStudentId());
//    }
//
//    @PostMapping("/login")
//    public Member login(@RequestBody MemberLoginRequest request) {
//        return memberService.login(request.getEmail(), request.getPassword());
//    }
//
//    // 추가적인 엔드포인트가 필요하다면 여기에 추가
//}
