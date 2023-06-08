package com.company;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        int[] array =  {1,2,3,7,11,9,15};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);
        System.out.println("reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array){

        int maxIndex = array.length-1;
        int halfLength = array.length /2;
        for(int i = 0;i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex- i] = temp;

        }
    }
}
