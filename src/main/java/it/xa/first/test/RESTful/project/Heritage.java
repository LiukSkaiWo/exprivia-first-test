package it.xa.first.test.RESTful.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Heritage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private long value;

    private int yearOfCreation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Heritage() {}

    public Heritage(long id, String name, long value, int yearOfCreation) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.yearOfCreation = yearOfCreation;
    }

}
