package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void add() {
        Add a =  new Add() ;
        int actualResult = a.add(2, 3) ;
        assertEquals(5,actualResult);
        System.out.println("Test has passed for the ;last time");
    }
}