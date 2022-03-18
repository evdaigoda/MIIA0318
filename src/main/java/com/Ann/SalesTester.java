package com.Ann;

public class SalesTester {
    public static void main(String[] args){
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("002",500);
        SilverCustomer c3 = new SilverCustomer("003",3000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
