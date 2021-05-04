package com.init.products.modelo;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name", nullable = false, length = 30)
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
