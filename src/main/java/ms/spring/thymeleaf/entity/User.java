package ms.spring.thymeleaf.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private boolean enabled;
    private Set<String> roles;
}
