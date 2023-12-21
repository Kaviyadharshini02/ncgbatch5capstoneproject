package com.altimetrik.Route.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Route {

    @Id
    @GeneratedValue
    private int routeId;
    private String Source;
    private String Destination;
    private int totalKms;

}
