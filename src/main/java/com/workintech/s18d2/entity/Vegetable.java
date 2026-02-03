package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vegatable", schema = "fsweb")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @Column(name = "is_grown_on_tree")
    private Boolean grownOnTree;
    public boolean isGrownOnTree() {
        return grownOnTree;
    }

    public void setGrownOnTree(boolean grownOnTree) {
        this.grownOnTree = grownOnTree;
    }

}
