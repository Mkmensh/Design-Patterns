package com.company;
import java.util.Date;

public class Main {
    public static void main(String[] args){
    }
}

class Payment{
    private float amount;
    private IauthorizeBehavior authorizeBehavior;
    private IprintBehavior printBehavior;

    public IauthorizeBehavior getAuthorizeBehavior() {
        return authorizeBehavior;
    }

    public void setAuthorizeBehavior(IauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }

    public IprintBehavior getPrintBehavior() {
        return printBehavior;
    }

    public void setPrintBehavior(IprintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
}


//Classes that inherit Payment :

class Cash extends Payment{
    private float cashTendered;
}
class Check extends Payment{
    private String name;
    private String bankId;
}
class Credit extends Payment{
    private String name;
    private String type;
    private Date expDate;
}
//--------------------------------------------------
//Interfaces :

interface IauthorizeBehavior{
    public abstract boolean authorized();
}
interface IprintBehavior{
    public abstract void printReceipt();
}

//--------------------------------------------------
//The classes that implement IauthorizeBehavior :

abstract class AuthorizeCheck implements IauthorizeBehavior{
    public abstract boolean authorized();
}
abstract class AuthorizeCredit1 implements IauthorizeBehavior{
    public abstract boolean authorized();
}
abstract class AuthorizeCredit2 implements IauthorizeBehavior{
    public abstract boolean authorized();
}
abstract class AuthorizeNon implements IauthorizeBehavior{
    public abstract boolean authorized();
}

//---------------------------------------------------
//The classes that inherit IprintBehavior :

abstract class PrintCashTrans implements IprintBehavior{
    public abstract void printReceipt();
}
abstract class PrintNon implements IprintBehavior{
    public abstract void printReceipt();
}