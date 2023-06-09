package day3;

interface Bank {

    void account();
}

interface Bank1 {

    void account();
}

interface ATM extends Bank, Bank1 {
    void insertCard();

    void selectOption();

    void enterPassword();
}

interface AA {
    void m1();
}

abstract class NewATM implements ATM, AA {
    public void account() {

    }

    public void m1() {

    }
}

class InterfaceBank extends NewATM {
    public void insertCard() {
        System.out.println("Insert Card");

    }

    public void selectOption() {
        System.out.println("Select Option");
    }

    @Override
    public void enterPassword() {
        System.out.println("Enter Password");
    }
}

public class BankInterface {

    public static void main(String[] args) {
        InterfaceBank obj = new InterfaceBank();
        obj.insertCard();
        obj.selectOption();
        obj.enterPassword();
    }

}