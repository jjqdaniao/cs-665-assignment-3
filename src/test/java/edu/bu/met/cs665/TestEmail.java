package edu.bu.met.cs665;

import edu.bu.met.cs665.UserBehavior.*;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEmail {

    public TestEmail() {
    }

    @Test
    public void testNew() {

        New aNew = new New("John", "Doe","Mr");
        aNew.send();
        System.out.println(aNew.getMessage());

    }


    @Test
    public void testVIP() {

        VIP vip = new VIP("Bob", "Dylan","Mr");
        vip.send();
        System.out.println(vip.getMessage());
    }


    @Test
    public void testReturning() {

        Returning returning = new Returning("Taylor", "Swift","Ms");
        returning.send();
        System.out.println(returning.getMessage());

    }


    @Test
    public void testFrequent() {

        Frequent frequent = new Frequent("Lebron", "James","Mr");
        frequent.send();
        System.out.println(frequent.getMessage());

    }


    @Test
    public void testBusiness() {

        Business business = new Business("James", "Harden","Mr");
        business.send();
        System.out.println(business.getMessage());
    }


}
