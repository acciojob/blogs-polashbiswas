package com.driver.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;
    private String passWord;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Blog> blogList;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}