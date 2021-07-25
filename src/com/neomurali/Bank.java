package com.neomurali;

public class Bank {
    /*
    * Polymorphism is used to perform a single action in different ways.
    * There are two types of polymorphism in Java:
    *   1) compile-time polymorphism
    *   2) runtime polymorphism.
    * We can perform polymorphism in java by method overloading and method overriding.
    *   Overloading - compile-time polymorphism
    *   Overriding - runtime polymorphism.
    */

    /*
    * Overloading Method - same class, same name, but different number of arguments
    */

    // In this method, one argument is used
    public void customerDetails(String name){
        System.out.println(name);
    }

    // Here, method name is same, but two arguments are used.
    public void customerDetails(String name, String address){
        System.out.println(name);
        System.out.println(address);
    }

    // Here, method name is same, but 4 arguments are used.
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

    /*
    * There two types of method.
    * If method doesn't return any value, we should use 'void'.
    * Syntax:
    *   public void methodName(arg1, arg2, ...) {
    *   }
    *
    * If method return any value, we should use the dataType instead of void.
    * Syntax:
    *   public dataType methodName(arg1, arg2, ...){
    *       return variableName;
    *   }
    *
    * Note: Passing arguments in methods are optional and Methods can be used with or without arguments
     */
    public int addition(int a, int b){
        return a + b;
    }

    /* This is the main method.
    * We can run our program only inside this method.
    * The methods created here are called "Instance methods"
    * Methods can be called by creating an instance or object of a class
    */

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
