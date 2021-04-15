package com.wolken.wolkenapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.dto.VehicleDTO;

@RestController
@RequestMapping("/")
public class GarageController {

	VehicleDTO vehicleDTO = new VehicleDTO();

	public GarageController() {
		vehicleDTO.setVehicleId(1);
		vehicleDTO.setType("Bike");
		vehicleDTO.setColor("Black");
		vehicleDTO.setNoOfWheels(2);
	}

	@GetMapping("/getAll")
	public VehicleDTO getAll() {
		return vehicleDTO;
	}

	@PostMapping("/save")
	public String save(@RequestBody VehicleDTO vehicleDTO) {
		return "Saved the data:\n" + "Vehicle Color:" + vehicleDTO.getColor() + "\nVehicle Id:"
				+ vehicleDTO.getVehicleId();
	}

	@PutMapping("/update")
	public String update(@RequestBody VehicleDTO vehicleDTO) {
		return "Updated the data:\n"+"Vehicle Type:"+vehicleDTO.getType()+"\nNo. Of Wheels:"+vehicleDTO.getNoOfWheels();
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody VehicleDTO vehicleDTO) {
		return "Deleted the data:\n"+"Vehicle Type:"+vehicleDTO.getType()+"\nVehicle Color:"+vehicleDTO.getColor();
	}
}
