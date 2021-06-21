package com.example.springclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity{

    @Column(name = "description")
    private String description;

}
