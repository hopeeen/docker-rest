package im.hesjevik.api.web.rest.endpoint;

import im.hesjevik.api.repository.AccountRepository;
import im.hesjevik.api.domain.AccountEntity;
import im.hesjevik.api.web.rest.resource.AccountResource;
import im.hesjevik.api.web.rest.resource.assembler.AccountResourceAssembler;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Optional;

@RestController
@ExposesResourceFor( AccountResource.class )
public class AccountsEndpoint {

    @Inject
    AccountRepository accountRepository;

    @Inject
    AccountResourceAssembler accountResourceAssembler;

    @RequestMapping(value="/accounts/{id}",
        method = RequestMethod.GET,
        produces = "application/hal+json")
    public ResponseEntity<AccountResource> getAccount(@PathVariable Long id) {
        return Optional.ofNullable(accountRepository.findOne(id))
            .map(accountEntity -> new ResponseEntity<AccountResource>(
                accountResourceAssembler.toResource(accountEntity),
                HttpStatus.OK
            ))
            .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value="/accounts",
        method = RequestMethod.PUT,
        produces = "application/hal+json")
    public ResponseEntity<AccountResource> addAccount(@RequestBody AccountResource accountResource) {
        AccountEntity accountEntity = new AccountEntity();
        accountRepository.save(accountEntity);

        accountResource = accountResourceAssembler.toResource(accountEntity);

        //TODO: Add location header and remove entity from body
        return new ResponseEntity<AccountResource>(
            accountResource,
            HttpStatus.CREATED
        );
    }
}
