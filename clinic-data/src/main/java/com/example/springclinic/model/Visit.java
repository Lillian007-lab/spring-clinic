package com.example.springclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
