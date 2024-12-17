package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ImageData {
    @Id
    private String id;
    private Byte image;
}
