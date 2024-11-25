package io.codeforall.fanstatics.manytoone;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String name;

        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Employee> employee;

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

        public List<Employee> getEmployee() {
            return employee;
        }

        public void setEmployee(List<Employee> employee) {
            this.employee = employee;
        }
    }
