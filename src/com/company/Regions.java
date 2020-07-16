package com.company;

import javax.persistence.*;

@Entity
@Table(name = "Cuz2020.Regions")

public class Regions {
    /**
     * id is an identity type field in the database and the primary key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item: " + id + "\t" + title + "";
    }
}
