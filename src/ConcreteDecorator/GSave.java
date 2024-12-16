package ConcreteDecorator;

import ComponentInterface.BankAccount;
import ConcreteComponent.SavingsAccount;
import DecoratorInterface.BankAccountDecorator;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(SavingsAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, Gcash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
