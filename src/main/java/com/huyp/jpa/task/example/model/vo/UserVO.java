package com.huyp.jpa.task.example.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.huyp.jpa.task.example.model.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
//@Table(name = "student")
public class UserVO extends User {
}
