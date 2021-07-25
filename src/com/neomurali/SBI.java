package com.neomurali;

/*
* the keyword "extends" is used to mention the SuperClass or ParentClass
* ChildClass can inherits or use all the methods (only public methods) of ParentClass
*/

public class SBI extends Bank {

    /*
    * In @Override method, we can use all the actions from the ParentClass without recreating the same method.
    * Additionally, other set actions can be added
    * in this method, this method can perform all the actions inside the ParentClass method
    *  and can print "Interest rate is 10%"
    */

    @Override
    public void customerDetails(String name, String address, int age, boolean seniorCitizen) {
        // the below code will perform all the actions from the ParentClass method
        super.customerDetails(name, address, age, seniorCitizen);
        // This code will print the interest rate too.
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
