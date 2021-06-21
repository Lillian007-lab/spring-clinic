package com.example.springclinic.model;

import java.util.HashSet;
import java.util.Set;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "bet_specialties",
                joinColumns = @JoinColumn(name = "vet_id"),
                inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialities = new HashSet<>();

}
