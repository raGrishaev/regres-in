package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(fluent = true)
@JsonAutoDetect()
public class CreateUserResponse {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
