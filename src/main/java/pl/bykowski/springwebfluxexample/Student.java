package pl.bykowski.springwebfluxexample;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

    private String id;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
