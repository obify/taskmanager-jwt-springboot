package com.mycompany.taskmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column
    private ERole name;

    public void setName(ERole name) {
        this.name = name;
    }

    public ERole getName() {
        return name;
    }
}
