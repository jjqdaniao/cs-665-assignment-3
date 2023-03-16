/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 3/15/2023
 * File Name: Returning.java
 * Description: This class is responsible for the overriding send method of a Send interface for Returning users.
 */
package edu.bu.met.cs665.UserBehavior;

import static java.lang.String.format;

public class Returning extends User implements Send{
    public Returning(String first_name, String last_name, String gender) {
        super(first_name, last_name, gender);
    }

    public Returning() {
    }

    @Override
    public void send() {
        this.setMessage(format("Dear %s. %s, \n    It's a Greeting letter to our returning users. " +
                        "Welcome back to our system from CS 665 Zhilin's Email Application Generation Assignment " +
                        "assigned by Prof ED.",
                this.getGender(), this.getLast_name()));
    }
}
