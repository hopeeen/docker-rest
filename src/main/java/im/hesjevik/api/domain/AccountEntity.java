package im.hesjevik.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AccountEntity {

    @Id
    @GeneratedValue
    private Long id;

    public AccountEntity() {}

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
            "Account[id=%d]",
            id
        );
    }

}
