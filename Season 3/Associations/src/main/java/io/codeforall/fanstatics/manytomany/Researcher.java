package io.codeforall.fanstatics.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "researcher")
public class Researcher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Laboratory> laboratory;


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

    public List<Laboratory> getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(List<Laboratory> laboratories) {
        this.laboratory = laboratories;
    }
}