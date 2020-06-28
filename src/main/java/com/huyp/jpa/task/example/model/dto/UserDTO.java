package com.huyp.jpa.task.example.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.huyp.jpa.task.example.model.User;
import lombok.*;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends User {

    private List<User> userList;

}
