/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seba
 */
public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;   
    }
    
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" + "amount=" + amount + ", currency=" + currency + '}';
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    
}
