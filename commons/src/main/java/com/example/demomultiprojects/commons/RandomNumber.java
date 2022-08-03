package com.example.demomultiprojects.commons;

import java.util.Random;

public class RandomNumber {

    public static int random() {
        return new Random().nextInt(400);
    }
}