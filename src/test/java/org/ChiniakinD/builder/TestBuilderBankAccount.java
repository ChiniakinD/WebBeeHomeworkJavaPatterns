package org.ChiniakinD.builder;

import org.ChiniakinD.patterns.builder.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TestBuilderBankAccount {

    @Test
    void buildWithAllFieldsShouldCreateBankAccount() {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("12345678901234567890")
                .setBalance(50000)
                .setIsActive(true)
                .build();

        assertEquals("Dmitrii", bankAccount.getFirstName());
        assertEquals("Chiniakin", bankAccount.getMiddleName());
        assertEquals("Alexseevich", bankAccount.getLastName());
        assertEquals("12345678901234567890", bankAccount.getAccountNumber());
        assertEquals(50000, bankAccount.getBalance());
        assertTrue(bankAccount.isActive());
    }

    @Test
    void buildWithoutFirstNameShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("09876543210987654321")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithoutMiddleNameShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setLastName("Alexseevich")
                .setAccountNumber("09876543210987654321")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithEmptyFirstNameShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("    ")
                .setMiddleName("Chiniakin")
                .setLastName("Alexseevich")
                .setAccountNumber("09876543210987654321")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithEmptyMiddleNameShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName("  ")
                .setLastName("Alexseevich")
                .setAccountNumber("09876543210987654321")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithMoreDigitsInAccountNumberShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName(" Chiniakin ")
                .setLastName("Alexseevich")
                .setAccountNumber("09876543210987654321421142352")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithLessDigitsInAccountNumberShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName(" Chiniakin ")
                .setLastName("Alexseevich")
                .setAccountNumber("098742352")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithLettersInAccountNumberShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName(" Chiniakin ")
                .setLastName("Alexseevich")
                .setAccountNumber("0A8765432C09876543B1")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }

    @Test
    void buildWithNullAccountNumberShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount.BankAccountBuilder()
                .setFirstName("Dmitrii")
                .setMiddleName(" Chiniakin ")
                .setLastName("Alexseevich")
                .setBalance(50000)
                .setIsActive(true)
                .build()
        );
    }
}
