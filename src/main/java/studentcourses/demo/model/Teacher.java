package studentcourses.demo.model;

import javax.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String name;
    private String email;
    private String subject;


    public Teacher(String name, String email, String subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
    }

    public Teacher() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return name + " ("+ email + ")";

    }
}
