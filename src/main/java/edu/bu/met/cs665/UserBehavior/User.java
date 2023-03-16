/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 3/15/2023
 * File Name: User.java
 * Description: This abstract class is responsible for constructing basic structure for other users to inherit.
 */
package edu.bu.met.cs665.UserBehavior;

public abstract class User {
    private String first_name;
    private String last_name;
    private String gender;
    private String e_add;

    public User(String first_name, String last_name, String gender, String e_add) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.e_add = e_add;
    }

    public User(String first_name, String last_name, String gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
    }

    public User() {
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private static String message;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getE_add() {
        return e_add;
    }

    public void setE_add(String e_add) {
        this.e_add = e_add;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender=" + gender +
                ", e_add='" + e_add + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
