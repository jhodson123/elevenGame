package com.company;
public class CardTester {

	public static void main(String[] args) {

		Card card1 = new Card("8", "Clubs", 8);
        Card card2 = new Card("3", "Clubs", 3);
        Card card3 = new Card("5", "Clubs", 5);

        System.out.println(card1.matches(card2));
        System.out.println(card3.toString());
    }
}
