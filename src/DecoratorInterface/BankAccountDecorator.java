package DecoratorInterface;

import ComponentInterface.BankAccount;

public interface BankAccountDecorator extends BankAccount {
    void setBankAccount(BankAccount bankAccount);
}
