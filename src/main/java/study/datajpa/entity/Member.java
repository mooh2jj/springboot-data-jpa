package study.datajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    protected Member() {        // jpa 스펙에는 프록시로 만들어줘야 private로 하면 안돼!
    }

    public Member(String username) {
        this.username = username;
    }


}
