package org.github.arnisfet.restfullbackend.data.controller;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.hibernate.validator.constraints.Length;

import java.sql.Timestamp;

@Data
public class ClientControllerData {
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

    public ClientData toClientData() {
        return ClientData.builder()
                .client_name(this.client_name)
                .client_surname(this.client_surname)
                .birthday(this.birthday)
                .gender(this.gender)
                .registration_date(this.registration_date)
                .address_id(this.address_id).build();
    }
}
