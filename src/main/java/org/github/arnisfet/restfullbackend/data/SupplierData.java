package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SupplierData {
    @Id
    private String id;
    private String name;
    private Integer address;
    private String phone_number;
}
