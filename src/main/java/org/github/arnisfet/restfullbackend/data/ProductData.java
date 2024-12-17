package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class ProductData {
    @Id
    private Long id;
    private String category;
    private Long price;
    private Boolean available_in_stock;
    private Timestamp last_update_date;
    private Integer supplier_id;
    private UUID image_id;
}
