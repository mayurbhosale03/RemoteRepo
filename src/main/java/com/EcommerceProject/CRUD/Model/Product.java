package com.EcommerceProject.CRUD.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity // Marks this class as a JPA entity, mapped to a database table
@Table(name = "products") // Optional: specifies the table name if different from class name
@NoArgsConstructor // Lombok: generates a no-argument constructor
@AllArgsConstructor // Lombok: generates a constructor with all fields
@Getter // Lombok: generates getters for all fields
@Setter // Lombok: generates setters for all fields
public class Product {

    @Id // This annotation marks the 'prd_id' field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Strategy for primary key generation
    private Long prd_id; // Often a Long or Integer for primary keys

}
