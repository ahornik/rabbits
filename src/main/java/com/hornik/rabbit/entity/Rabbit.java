package com.hornik.rabbit.entity;

import javax.persistence.*;

@Entity
@Table(name="lapins")
public class Rabbit {

    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="naissance")
    private String naissance;


    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "clapier_id")
    private Clapier clapier;



    @Override
    public String toString() {
        return "Rabbit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", naissance='" + naissance + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaissance() {
        return naissance;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public Clapier getClapier() {
        return clapier;
    }

    public void setClapier(Clapier clapier) {
        this.clapier = clapier;
    }



    public Rabbit() {

    }

    public Rabbit(int id, String name, String naissance) {
        this.id = id;
        this.name = name;
        this.naissance = naissance;
    }
}
