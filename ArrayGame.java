import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class ArrayGame {
	public static void main(String[] args) {
		String[][] game = { {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, };
		String O = "O";
		String direction = "";
		game[0][0] = ("x");
		int winx = (int) (Math.random() * 3 + 1);
		int winy = (int) (Math.random() * 3 + 1);
game[winx][winy] = ("*");
		System.out.println("Welcome to the Array Game! Move your sprite \"x\" to the \"*\" to win.");	
		for(int row = 0; row < game.length; row++){
			for(int col = 0; col < game[0].length; col++){
				System.out.print(game[row][col] + " ");
			}	
			System.out.println();
		}	
	gamePlay(winx, winy, game);
	}
	public static void gamePlay(int winx, int winy, String game[][]) {
		int x = 0;
		int y = 0;
	for ( ;(winx!=x||winy!=y); ) {
		Scanner kin = new Scanner(System.in);
		System.out.print("\nWhich direction would you like to move? ");
		String direction = kin.nextLine();
		if (direction.equals("up")) {
			game[x][y] = "O";
			x = x - 1;
			if (x < 0) {
				System.out.println("Invalid Input");
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("down")) {
			game[x][y] = "O";
			x = x + 1;
			if (x > 3) {
				System.out.println("Invalid Input");
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("left")) {
			game[x][y] = "O";
			y = y - 1;
			if (y < 0) {
				System.out.println("Invalid Input");
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("right")) {
			game[x][y] = "O";
			y = y + 1;
			if (y > 3) {
				System.out.println("Invalid Input");
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}	
	} System.out.println("\nCongrats, you have won!");
	}
}