
public class QuickDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("Please enter 2 player names.");
		}else {
			String p1 = args[0];
			String p2 = args[1];
			DeckOfCards deck = new DeckOfCards();
			deck.shuffle();
			System.out.print(deck.toString());
			System.out.println("you Drew a " + deck.draw().toString());
			Card pl1 = deck.draw();
			Card pl2 = deck.draw();
			if (pl1.compareTo(pl2) ==-1) {
				System.out.println(p1 + " " + pl1.toString() + " vs " + pl2.toString() + " " + p2 + "\n" + p2 + " WINS!");
			}else if(pl1.compareTo(pl2) ==1) {
				System.out.println(p1 + " " + pl1.toString() + " vs " + pl2.toString() + " " + p2 + "\n" + p1 + " WINS!");
			}else {
				System.out.println(p1 + " " + pl1.toString() + " vs " + pl2.toString() + " " + p2 + "\n" + "ITS A TIE!");

			}
			System.out.println("Cards Drawn: " + deck.numCardsDealt() + " Cards Remaining: " + deck.numCardsRemaining());

		}
	}

}
