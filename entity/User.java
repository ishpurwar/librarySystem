package entity;

import java.util.Objects;

public class User {
    private static int serialVersionUID = 1;
    protected String name;
    protected String email;
    protected String phone;
    private int id;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id=serialVersionUID++; 

    }

    
    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }

    // toString
    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', phone='" + phone + "'}";
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
