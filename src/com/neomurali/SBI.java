package com.neomurali;

public class SBI extends Bank {

    @Override
    public void customerDetails(String name, String address, int age, boolean seniorCitizen) {
        super.customerDetails(name, address, age, seniorCitizen);
        System.out.println("Interest rate is 10%");
    }

    @Override
    public void customerDetails(String name) {
        super.customerDetails(name);

    }

    @Override
    public void customerDetails(String name, String address) {
        super.customerDetails(name, address);
    }

    @Override
    public void customerDetails(String name, String address, int age, double salary) {
        super.customerDetails(name, address, age, salary);
    }

    public static void main(String[] args) {
        SBI sbi1 = new SBI();
        sbi1.customerDetails("Murali", "Chennai", 15, false);
    }
}
