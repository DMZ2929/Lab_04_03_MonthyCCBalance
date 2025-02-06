//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double balance = 5000.0;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;
        double interestAfterOneMonth = balance * monthlyInterestRate;
        double balanceAfterOneMonth = balance + interestAfterOneMonth;
        double interestAfterTwoMonths = balanceAfterOneMonth * monthlyInterestRate;

        System.out.println("Initial balance: $" + balance);
        System.out.println("Monthly interest rate: " + (monthlyInterestRate * 100) + "%");
        System.out.println("Interest due after one month: $" + interestAfterOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestAfterTwoMonths);

            }
        }






