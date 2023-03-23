package com.javaeasily.demos;

public class App {
    public static void main(String[] args) {
        System.out.println("Loan Calculator".toUpperCase());
        System.out.println();
        int loanAmount = 100;
        int numberOfYears = 5;
        double interestRate = 10.0;
        System.out.println("Calculating loan based on:");
        System.out.println("Initial Amount:   £" + loanAmount);
        System.out.println("Number of years:  " + numberOfYears);
        System.out.println("Interest Rate:    " + interestRate + "%"
        );
        // Shouldn't use doubles for currency, should use BigDecimal, but this is just for beginner purposes.
        double interestRateMultiplier = interestRate / 100 + 1;
        double yearOne = loanAmount * interestRateMultiplier;
        double yearTwo = yearOne * interestRateMultiplier;
        double yearThree = yearTwo * interestRateMultiplier;
        double yearFour = yearThree * interestRateMultiplier;
        double yearFive= yearFour * interestRateMultiplier;
        String yearFiveString = Double.toString(yearFive);
        String totalAmountDue = yearFiveString.substring(0, yearFiveString.indexOf(".") + 3);
        System.out.println("Total Amount Due: £" + totalAmountDue);
    }
}
