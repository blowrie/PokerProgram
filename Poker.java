import java.util.*;

public class Untitled {
	public static void main(String[] args) {
		
		String[] black = new String[5];
		String[] white = new String[5];
		int card, suitRand;
		int counter = 0;
		int wCounter = 0;
		char suitFinal, faceCard;
		
		
		
		System.out.println("Welcome to the poker: texas holdem. press enter to deal the cards.");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
	do {
		Random rand = new Random();
		
		card = 1 + rand.nextInt(14);
		suitRand = 1 + rand.nextInt(4);
		
		if(card > 9) {
			switch(card) {
				case 10: 
					faceCard = 'T';
					break;
				case 11: 
					faceCard = 'J';
					break;
				case 12:
					faceCard = 'Q';
					break;
				case 13: 
					faceCard = 'K';
					break;
				case 14: 
					faceCard = 'A';
					break;
				default: 
					faceCard = 'U';
					break;
			}		
		} else {
			faceCard = 'U';
		}
		
		switch(suitRand) {
			case 1: 
				suitFinal = 'C';
				break;
			case 2:
				suitFinal = 'S';
				break;
			case 3: 
				suitFinal = 'D';
				break;
			case 4:
				suitFinal = 'H';
				break;
			default:	
				suitFinal = 'U';
				break;
		}
		
		if (counter < 5) {
			 black[counter] = display(card, suitFinal, faceCard);
		} else {
			white[wCounter] = display(card, suitFinal, faceCard);
			wCounter++;
		}
		
		counter ++;
		
	} while(counter != 10);
		
		System.out.format("Black: %s, %s, %s, %s, %s", black[0], black[1], black[2], black[3], black[4]);
		System.out.format("\tWhite: %s, %s, %s, %s, %s", white[0], white[1], white[2], white[3], white[4]);
		
		
//End Brackets
	}
	
	public static String display(int card, char suit, char faceCard) {
		StringBuilder sb = new StringBuilder();
		
		if(card < 10) {
			return sb.append(card).append(suit).toString();
		} else {
			return sb.append(faceCard).append(suit).toString();
		}
	}
}