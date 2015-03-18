package im.hesjevik.api.web.rest.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class AccountResource extends ResourceSupport {

    @JsonCreator
    public AccountResource() {}

}
