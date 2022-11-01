import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards implements DeckOfCardsInterface{
	private final int DECKSIZE = 52;
	private ArrayList<Card> deck;
	private int nextCardIndex = 1;
	
	public DeckOfCards() {
		deck = new ArrayList<Card>();
		for(Suit s: Suit.values()) {
			for(Rank r: Rank.values()) {
				Card c = new Card(s,r);
				deck.add(c);
			}
		}
	}
	public String toString() {
		String d= "";
		for( Card c: deck) {
			d = d.concat(c.toString() + "\n");
		}
		
		return d;
		
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		ArrayList<Card> shuffleDeck = new ArrayList<Card>();
		for(int i=0; i < DECKSIZE; i++) {
			Random rand = new Random();
			int c = rand.nextInt(DECKSIZE - i);
			shuffleDeck.add(deck.get(c));
			deck.remove(c);
		}
		nextCardIndex =1;
		deck =shuffleDeck;
	}

	@Override
	public Card draw() {
		int index = DECKSIZE - nextCardIndex;
		if(nextCardIndex < DECKSIZE) {
			Card c= deck.get(index);
			nextCardIndex++;			
			return c;
		}else {
			return null;
		}
		
		// TODO Auto-generated method stub
	}

	@Override
	public int numCardsRemaining() {
		// TODO Auto-generated method stub
		return DECKSIZE - (nextCardIndex -1);
	}

	@Override
	public int numCardsDealt() {
		// TODO Auto-generated method stub
		return nextCardIndex -1;
	}

	@Override
	public Card[] dealtCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card[] remainingCards() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
