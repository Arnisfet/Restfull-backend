package org.github.arnisfet.restfullbackend.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class AddressData {
    @Id
    private Integer id;
    @NotNull
    private String country;
    @NotNull
    private String city;
    @NotNull
    private String street;
}
