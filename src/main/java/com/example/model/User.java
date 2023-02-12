package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Table(name = "usersdb")
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @SequenceGenerator(
            name = "u_id_sequence",
            sequenceName = "usersdb_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "u_id_sequence"
    )
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
