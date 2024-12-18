package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "product")
public class ProductData {
    @Id
    private Integer id;
    @Length(max = 200)
    private String name;
    @Length(max = 100)
    private String category;
    @Min(1)
    private BigDecimal price;
    @Min(1)
    private Integer available_stock;
    private Timestamp last_update_date;
    private Integer supplier_id;
    private UUID image_id;
}
