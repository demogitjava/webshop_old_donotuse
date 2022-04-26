package de.jgsoftware.webshop.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS", schema = "PUBLIC", catalog = "SHOPDB")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String username;

    private String password;
    private String role;


	/*
	public User(String username, String password, String role)
	{
		this.username = username;
		this.password = password;
		this.role = role;
	}
		*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}