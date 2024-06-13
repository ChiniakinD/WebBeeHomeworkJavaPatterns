package org.ChiniakinD.patterns.builder;

/**
 * Данный класс представляет банковский аккаунт.
 * Он создается с помощью паттерна builder.
 *
 * @author Chiniakin Dmitrii
 */
public final class BankAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private final String accountNumber;
    private long balance;
    private boolean isActive;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.firstName = bankAccountBuilder.firstName;
        this.middleName = bankAccountBuilder.middleName;
        this.lastName = bankAccountBuilder.lastName;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.balance = bankAccountBuilder.balance;
        this.isActive = bankAccountBuilder.isActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    /**
     * Внутренний класс BankAccountBuilder необходим для создания объектов класса BankAccount.
     */

    public static final class BankAccountBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private String accountNumber;
        private long balance;
        private boolean isActive;

        public BankAccountBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BankAccountBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public BankAccountBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BankAccountBuilder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder setBalance(long balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder setIsActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public BankAccount build() {
            if (isBankAccountUnCorrect()) {
                throw new IllegalArgumentException("Отсутствие имени или фамилии пользователя");
            }
            return new BankAccount(this);
        }

        private boolean isBankAccountUnCorrect() {
            return firstName == null
                    || middleName == null
                    || firstName.trim().isEmpty()
                    || middleName.trim().isEmpty()
                    || isAccountNumberUnCorrect();
        }

        private boolean isAccountNumberUnCorrect() {
            return !(accountNumber != null && accountNumber.trim().matches("\\d{20}"));
        }
    }

}
