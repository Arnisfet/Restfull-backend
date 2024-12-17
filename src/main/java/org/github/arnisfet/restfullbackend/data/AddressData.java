package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddressData {
    @Id
    private String id;
    private String country;
    private String city;
    private String street;
}
