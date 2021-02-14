package com.h2;

public class SavingsCalculator {
    private float[] credits;
    private float[]  debits;

    public SavingsCalculator(float[] credits, float[] debits){
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits(){
        float sum = 0.0f;
        for(float credit: credits) {
            sum = sum + credit;
        }
        return sum;
    }

    private float sumOfDebits(){
        return 0.0f;
    }
}
