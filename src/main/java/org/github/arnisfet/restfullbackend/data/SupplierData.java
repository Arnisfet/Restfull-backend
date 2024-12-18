package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "supplier")

public class SupplierData {
    @Id
    private Integer id;
    @NotNull
    @Length(max = 150)
    private String name;
    private Integer address_id;
    @Length(max = 15)
    private String phone_number;
}
