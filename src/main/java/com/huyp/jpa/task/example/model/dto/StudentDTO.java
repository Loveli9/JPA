package com.huyp.jpa.task.example.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.huyp.jpa.task.example.model.Student;
import lombok.*;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class StudentDTO extends Student {

}
