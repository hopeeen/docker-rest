package im.hesjevik.api.repository;

import im.hesjevik.api.domain.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

}
