package com.krishnancode;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0]= "Purple";
        colors[1]= "Blue";
        colors[2] = "Red";
        colors[3]= "Black";
        colors[4] = "Violet";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[4]);
        colors[2] = "Yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};
        System.out.println(numbers[1]);
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("=====================");

        for (int i = colors.length-1; i>=0; i--){
            System.out.println(colors[i]);
        }
        System.out.println("=====================");

        Arrays.stream(colors).forEach(System.out::println);




    }
}
