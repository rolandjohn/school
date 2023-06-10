package com.simplex.school.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "PERSON")
@ToString
public class Person extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    private Long personId;

    @NotEmpty
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotEmpty
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "CONTACT_NUMBER_SECONDARY")
    private String contactNumberSecondary;

    @NotEmpty
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ACTIVE")
    private Boolean active;

    @NotEmpty
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @OneToOne(
            mappedBy = "person",
            fetch = FetchType.LAZY,
            cascade = CascadeType.MERGE)
    @ToString.Exclude
    @PrimaryKeyJoinColumn
    private User user;
}
