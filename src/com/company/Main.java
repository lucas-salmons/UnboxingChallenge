package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Lucas",66.12);
    }
}
