package com.huyp.jpa.task.example.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.huyp.jpa.task.example.model.Student;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "student")
public class StudentVO extends Student {

}
