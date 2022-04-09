package study.datajpa.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberQueryRepository {

    private final EntityManager em;

    // 사용자 커스텀 클래스로 만드는 것이 훨씬 낫지. 핵심 비즈니스 로직을 잘 분리하는 데 이런게 나아!
    List<Member> findAllMembers() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
