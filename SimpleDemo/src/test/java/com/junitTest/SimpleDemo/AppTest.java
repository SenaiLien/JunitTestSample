package com.junitTest.SimpleDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAddMoney() {
    	
    	Account fakerAccount = new Account();
    	fakerAccount.setOwner("faker");
    	fakerAccount.setMoney(1);
        
    	
    	
    	Bank bank = mock(Bank.class);
    	//Account account = mock(Account.class);
    	
    	when(bank.getAccount(anyString())).thenReturn(fakerAccount);
    	
    	System.out.println(bank.getAccount(null).getOwner());
    	
        assertEquals("faker", bank.getAccount(null).getOwner());

    	
    }
}
