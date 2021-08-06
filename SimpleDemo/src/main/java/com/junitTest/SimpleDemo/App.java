package com.junitTest.SimpleDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bank bank = new Bank();
        System.out.println(bank.getBankName());
        
        Account customer1 = new Account();
        customer1.setOwner("Lily");
        customer1.setMoney(1000);
        bank.addAccount(customer1);
        
        Account customer2 = new Account();
        customer2.setOwner("Nicola");
        customer2.setMoney(10000);
        bank.addAccount(customer2);
        
        bank.storeMoney("Nicola", 1);
        bank.storeMoney("Nicola", 1);
        bank.storeMoney("Nicola", 1);
        bank.storeMoney("Nicola", 1);
        bank.storeMoney("Nicola", 1);
        
        System.out.println(bank.getAccount("Nicola").getMoney());
        
        System.out.println(bank.getAccount("Lily").getOwner());
    }
}
