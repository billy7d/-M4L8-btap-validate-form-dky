package model;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public User(){

    }

    public User(Integer id, @NotEmpty @Length(min = 5, max = 45) String firstName, @NotEmpty @Length(min = 5, max = 45) String lastName, @Min(18) int age, @NotEmpty @Email String email, @Pattern(regexp = "[0][0-9]{9}") String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    @NotEmpty
    @Length(min = 5, max = 45)
    private String firstName;


    @NotEmpty
    @Length(min = 5, max = 45)
    private String lastName;

    @Min(18)
    private int age;

    @NotEmpty
    @Email
    private String email;

    @Pattern(regexp = "[0][0-9]{9}")
    private String phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
