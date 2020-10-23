package abid.graphql.graphqlexample;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UserQuery implements GraphQLQueryResolver {

    public User getUser(Long id) {
        return new User(id, "Username " + id);
    }
}
