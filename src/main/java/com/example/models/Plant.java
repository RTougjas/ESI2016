package com.example.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Plant {
	@Id
	@GeneratedValue
	Long id;
	String name;
	String description;
	@Column(precision=8, scale=2)
	BigDecimal price;
	
}
