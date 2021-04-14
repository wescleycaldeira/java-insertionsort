package com.wcaldeira;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedElement = 1; firstUnsortedElement < intArray.length;
             firstUnsortedElement ++){
            int newElement = intArray[firstUnsortedElement];

            int i;

            for (i = firstUnsortedElement; i > 0 && intArray[i -1] > newElement; i --){
                intArray[i] = intArray[i -1];
            }

            intArray[i] = newElement;
        }

        for (int element : intArray){
            System.out.println(element);
        }

    }

}
