package im.hesjevik.api.web.rest.resource.assembler;

import im.hesjevik.api.domain.AccountEntity;
import im.hesjevik.api.web.rest.endpoint.AccountsEndpoint;
import im.hesjevik.api.web.rest.resource.AccountResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class AccountResourceAssembler extends ResourceAssemblerSupport<AccountEntity, AccountResource> {

    public AccountResourceAssembler() {
        super(AccountsEndpoint.class, AccountResource.class);
    }

    @Override
    public AccountResource toResource(AccountEntity entity) {
        AccountResource resource = createResourceWithId(entity.getId(), entity);
        return resource;
    }

    @Override
    protected AccountResource instantiateResource(AccountEntity entity) {
        AccountResource resource = new AccountResource();
        return resource;
    }
}
