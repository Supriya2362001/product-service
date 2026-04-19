package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// What happens here behind the scene is Hibernet reads this class and creates a table automatically.

// @Entity tells spring boot that this class needs to be stored in db as a table.
@Entity

// @Data is from lombok which automatically creates getters, setters, toString(), hashCode(), equals()
// instead of writng whole geetter setter methods.
@Data
// This class builds a table named Product with columns id, name, price, quantity.
public class Product {
    // @Id primary key of the table product.
    @Id
    // data base auto-generates unique identifiers.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // columns of the table.
    private Long id;
    private String name;
    private double price;
    private int quantity;

}
