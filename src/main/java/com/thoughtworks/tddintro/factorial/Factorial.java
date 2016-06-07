package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) {
        int return_val = 1;
        if(i < 0){
            System.out.println("The argument must be positive.");
            throw new IllegalArgumentException();
        }
        else if (i == 0 || i == 1) {
            return return_val;
        }else {
            for(int k = 2; k <= i; k++){
                return_val *= k;
            }
        }
        return return_val;
    }
}
