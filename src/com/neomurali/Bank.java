package com.neomurali;

public class Bank {

    public void customerDetails(String name){
        System.out.println(name);
    }

    public void customerDetails(String name, String address){
        System.out.println(name);
        System.out.println(address);
    }

    public void customerDetails(String name, String address, int age, double salary){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(salary);
    }

    public void customerDetails(String name, String address, int age, boolean seniorCitizen){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(seniorCitizen);
    }

    public int addition(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
       Bank bank1 = new Bank();
//        bank1.customerDetails("Murali");
//        bank1.customerDetails("Ravi", "454, madhavan nage, Chennai");
//        bank1.customerDetails("Ravi", "454, madhavan nage, Chennai", 35);
//        bank1.customerDetails("Ravi", "454, madhavan nage, Chennai", 35, false);

//        SBI sbiBank = new SBI();
//        sbiBank.customerDetails("Murali", "Chennai", 25, 45000);

        int result = bank1.addition(5, 6);
        System.out.println("Result 1 = " + result);

        int result2 = bank1.addition(4, result);
        System.out.println("Result 2 = " + result2);

        int result3 = bank1.addition(bank1.addition(12, 45), bank1.addition(58, 25));
        System.out.println("Result 3 = " + result3);



    }

}
