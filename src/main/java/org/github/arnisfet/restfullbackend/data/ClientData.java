package org.github.arnisfet.restfullbackend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class ClientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String client_name;
    private String client_surname;
    private Date birthday;
    private char gender;
    private Timestamp registration_date;
    private Long address_id;
}
