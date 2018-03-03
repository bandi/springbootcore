package com.ir.model;

import org.hibernate.validator.constraints.NotBlank;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "notes")
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Offer extends AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;



    // Getters and Setters ... (Omitted for brevity)
}