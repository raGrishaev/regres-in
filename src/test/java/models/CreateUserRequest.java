package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
@JsonAutoDetect()
public class CreateUserRequest {
    private String login;
    private String password;
}
