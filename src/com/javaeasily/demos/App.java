package com.javaeasily.demos;

public class App {
    public static void main(String[] args) {
        System.out.println("Loan Calculator");
        int loanAmount = 100;
        int numberOfYears = 5;
        double interestRate = 10.0;
        double interestRateMultiplier = interestRate / 100 + 1;
        double yearOne = loanAmount * interestRateMultiplier;
        double yearTwo = yearOne * interestRateMultiplier;
        double yearThree = yearTwo * interestRateMultiplier;
        double yearFour = yearThree * interestRateMultiplier;
        double yearFive= yearFour * interestRateMultiplier;
    }
}
