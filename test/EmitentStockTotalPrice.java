/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seba
 */
public class EmitentStockTotalPrice {
    
    @Test
    public void testMultiplication() {
        System.err.println("testMultiplication");
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        System.out.println("testEquality");
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
