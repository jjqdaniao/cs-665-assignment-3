/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 3/15/2023
 * File Name: Business.java
 * Description: This class is responsible for the overriding send method of a Send interface for business users.
 */
package edu.bu.met.cs665.UserBehavior;

import static java.lang.String.format;

public class Business extends User implements Send{
    public Business(String first_name, String last_name, String gender) {
        super(first_name, last_name, gender);
    }

    public Business() {
    }

    @Override
    public void send() {
        this.setMessage(format("Hi %s. %s, \n    It's an auto generated letter to our Business users. " +
                        "Thanks for using our system from CS 665 Zhilin's Email Application Generation Assignment " +
                        "assigned by Prof ED.",
                this.getGender(), this.getLast_name()));
    }
}
