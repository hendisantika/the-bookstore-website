package com.YP.bookstore.model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    // @Column(nullable = false, unique = true)
    // @NotEmpty
    // @Length(max = 16)
    private String username;
    private String password;
    private String email;
    private String address;

}
