package uhang.uhang.login.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uhang.uhang.login.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 추가적인 쿼리 메소드가 필요한 경우 여기에 추가 가능

}