package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "client")
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
    @Pattern(regexp = "M|F|O", message = "Gender must be one of the following: M, F, O")
    private char gender;
    private Timestamp registration_date;
    private Integer address_id;
}
