package com.simplex.school.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "USER_TABLE")
@ToString
public class User extends BaseEntity {

    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @NotEmpty
    @Column(name = "USERNAME    ")
    private String username;

    @NotEmpty
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "BLOCKED")
    private Boolean blocked;

    @OneToOne(
            fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "PERSON_ID")
    @ToString.Exclude
    private Person person;
}