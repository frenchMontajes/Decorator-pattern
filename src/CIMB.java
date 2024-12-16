import ConcreteComponent.SavingsAccount;
import ConcreteDecorator.*;

public class CIMB {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.setAccountNumber(1234);
        savingsAccount.setAccountName("Juan Dela Cruz");
        savingsAccount.setBalance(10000.0);

        System.out.println(savingsAccount.showInfo());
        System.out.println("Account type: " + savingsAccount.showAccountType());
        System.out.println("Interest rate: " + savingsAccount.getInterestRate());
        System.out.println("New balance: " + savingsAccount.computeBalanceWithInterest());
        System.out.println("Benefits: " + savingsAccount.showBenefits());

        System.out.println("----------------------");

        GSave gSave = new GSave(savingsAccount);
        System.out.println(gSave.showInfo());
        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + gSave.getInterestRate());
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + gSave.showBenefits());

        System.out.println("----------------------");

        UpSave upSave = new UpSave(savingsAccount);
        System.out.println(upSave.showInfo());
        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + upSave.getInterestRate());
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + upSave.showBenefits());
    }
}