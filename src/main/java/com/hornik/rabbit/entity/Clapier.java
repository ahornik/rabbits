package com.hornik.rabbit.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clapiers")
public class Clapier {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    int id;
    @Column(name="type")
    String type;

    @OneToMany(fetch=FetchType.LAZY,
            mappedBy="clapier",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    List<Rabbit> listRabbits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Clapier() {
    }

    @Override
    public String toString() {
        return "Clapier{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", listRabbits=" + listRabbits +
                '}';
    }

    public Clapier(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
