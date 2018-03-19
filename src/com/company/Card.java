
public class Card {


	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {

        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
	}

	public String suit() {

        return this.suit;
   }

	public String rank() {

        return this.rank;
	}

	public int pointValue() {

        return this.pointValue;
	}

	public boolean matches(Card otherCard) {

        if (this.pointValue() + otherCard.pointValue == 11){
            return true;
        }else {
            return false;
        }
	}

	@Override
	public String toString() {

        return rank() + " of " + suit() + "(point value = " + pointValue() + ")" ;
	}
}
