package org.github.arnisfet.restfullbackend.data.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.sql.Timestamp;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Length(max = 100)
    private String client_name;

    @NotNull
    @Length(max = 100)
    private String client_surname;

    @NotNull
    private java.sql.Date birthday;

    @NotNull(message = "Gender is required")
    private char gender;

    private Timestamp registration_date;

    private Integer address_id;
}
