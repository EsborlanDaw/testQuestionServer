package com.example.spring.helper;

import java.util.Random;

public class RandomHelper {
	
	 public static int getRandomInt(int min, int max) {
	        Random rand = new Random();
	        int randomNum = rand.nextInt((max - min) + 1) + min;
	        return randomNum;
	    }

}
