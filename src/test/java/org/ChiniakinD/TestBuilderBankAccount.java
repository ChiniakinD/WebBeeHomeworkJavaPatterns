package org.ChiniakinD;

import org.ChiniakinD.patterns.builder.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBuilderBankAccount {

    @Test
    void testBankAccountBuilder() {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("111")
                .setBalance(50000)
                .setIsActive(true)
                .build();

        assertEquals("Dmitrii", bankAccount.getFirstName());
        assertEquals("Chiniakin", bankAccount.getMiddleName());
        assertEquals("Alexseevich", bankAccount.getLastName());
        assertEquals("111", bankAccount.getAccountNumber());
        assertEquals(50000, bankAccount.getBalance());
        assertTrue(bankAccount.isActive());
    }

    @Test
    void testBankAccountBuilderIllegalException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("111")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setLastName("Alexseevich")
                .setAccountNumber("111")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("    ")
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("111")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName("  ")
                .setLastName("Alexseevich")
                .setAccountNumber("111")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );

    }
}