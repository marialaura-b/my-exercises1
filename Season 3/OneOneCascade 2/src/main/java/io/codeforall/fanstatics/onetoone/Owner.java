package io.codeforall.fanstatics.onetoone;

import io.codeforall.fanstatics.onetoone.Car;

import javax.persistence.*;

@Entity
@Table (name = "owner")
public class Owner {
    @Id
    private Integer id;
    private String name;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private Car car;

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
}