package com.vvalitsky.course.entities.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String middleName;
    @Column
    private String workNumber;
}
