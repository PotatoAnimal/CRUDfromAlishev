package spring.models;

public class Person {
    private int id;
    private String email;
    private int age;

    private String name;

    public Person() {
    }

    public Person(int id, String email, int age, String name) {
        this.id = id;
        this.email = email;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
