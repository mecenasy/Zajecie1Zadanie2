package com.company;

public class Main {

    public static void main(String[] args) {
	    int [] array = {2,5,10,13,2};
	    int [] array2 = {2,13,9,4};
	    int [] array3 = {13, 4};
        
        System.out.println(SumOfArrayUntil13(array));
        System.out.println(SumOfArrayUntil13(array2));
        System.out.println(SumOfArrayUntil13(array3));
    }
    
    static int SumOfArrayUntil13 (int[] array){
        int result = 0;

        for (int i = 0; i < array.length && array[i] != 13; i++){
            result+=  array[i];
        }
        
        return result;
    }
}
