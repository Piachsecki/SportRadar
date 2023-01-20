package com.example.app.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Venue {
    @Id
    private String id;
    private String name;
    private Integer capacity;
    private String cityName;
    private String countryName;
    private String mapCoordinates;
    private String countryCode;
}
