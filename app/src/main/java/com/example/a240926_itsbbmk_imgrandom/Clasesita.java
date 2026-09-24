package com.example.a240926_itsbbmk_imgrandom;

import java.util.Random;

public class Clasesita {
    public int code(){
        Random random = new Random();
        int val = random.nextInt(2) + 1;
        return val;
    }

}
