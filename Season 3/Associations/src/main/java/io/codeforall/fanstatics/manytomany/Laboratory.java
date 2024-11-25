package io.codeforall.fanstatics.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "laboratory")
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToMany( mappedBy = "laboratory",
            // fetch all security groups when fetching a user
            fetch = FetchType.LAZY)
    private List<Researcher> researchers;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Researcher> getResearchers() {
        return researchers;
    }

    public void setResearchers(List<Researcher>researchers) {
        this.researchers = researchers;
    }
}