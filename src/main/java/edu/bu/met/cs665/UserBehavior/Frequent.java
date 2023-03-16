/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 3/15/2023
 * File Name: Frequent.java
 * Description: This class is responsible for the overriding send method of a Send interface for frequent users.
 */
package edu.bu.met.cs665.UserBehavior;

import static java.lang.String.format;

public class Frequent extends User implements Send{
    public Frequent(String first_name, String last_name, String gender) {
        super(first_name, last_name, gender);
    }

    public Frequent() {
    }

    @Override
    public void send() {
        this.setMessage(format("Dear %s. %s, \n    It's a Thanks letter to our popular users. " +
                        "Thanks for choosing our system from CS 665 Zhilin's Email Application Generation Assignment " +
                        "assigned by Prof ED. Now you could take a look at our VIP benefits for better experience.",
                this.getGender(), this.getLast_name()));
    }
}
