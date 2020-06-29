package com.huyp.jpa.task.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Integer id;

    @ApiModelProperty(value = "姓名",example = "胡亚鹏")
    @Column(name = "name",length = 40)
    protected String name;

    @ApiModelProperty(value = "年龄",example = "26")
    @Column(name = "age",columnDefinition = "int(11) default 1")
    protected Integer age;

    @ApiModelProperty(value = "版本",example = "1")
    @Column(name = "version",columnDefinition = "int(11) default 0")
    protected Integer version;

    @ApiModelProperty(value = "分数",example = "90")
    @Column(name = "points",columnDefinition = "int(11) default 0")
    protected Integer points;

}
