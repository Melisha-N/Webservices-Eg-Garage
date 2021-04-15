package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Component
public class VehicleDTO {
	
	private int vehicleId;
	private int noOfWheels;
	private String type;
	private String color;
	
}
