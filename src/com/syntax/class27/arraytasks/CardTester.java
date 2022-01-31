package com.syntax.class27.arraytasks;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> creditCards=new LinkedList<>();
        creditCards.add(new CreditCard("CreditCard"));
        creditCards.add(new DebitCard("DebitCard"));
        creditCards.add(new PrepaidCard("PrepaidCard"));

        for (Card cd:creditCards) {
            cd.issueCard();
            cd.calculateInterest();

        }
    }
}
