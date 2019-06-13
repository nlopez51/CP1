import java.util.Scanner;
import java.util.Random;
public class Xgame {

public static void main(String[] args) {

char[][] gridArray = new char[4][4];
int randomRow;
int randomCol;
int randomRow2;
int randomCol2;
String moveSelect;
boolean validInput = true;

int min = 0;
int max = 4;

Random tRNG = new Random();
randomRow = tRNG.nextInt(max - min + 1) + min;
randomCol = tRNG.nextInt(max - min + 1) + min;
randomRow2 = tRNG.nextInt(max - min + 1) + min;
randomCol2 = tRNG.nextInt(max - min + 1) + min;

gridArray[randomRow][randomCol] = 'X';
gridArray[randomRow2][randomCol2] = '*';

for (int i = 0; i < gridArray.length; i++)
{
    for (int j = 0; j < gridArray.length; j++)
    {       
        if (!((i == randomRow && j == randomCol) || (i == randomRow2 &&  j == randomCol2)))
        {
            gridArray[i][j] = 'o';
        }
        System.out.print(gridArray[i][j]);
    }
    System.out.println("");  
}

System.out.println("Enter a movement choice W A S or D");
do{

    Scanner keyboard = new Scanner(System.in);
    moveSelect = keyboard.nextLine();

    if ( moveSelect.equals("w"))
    {
        randomRow -= 1;
        validInput = true;
        
    }

    else if ( moveSelect.equals("a"))
    {
        randomCol -= 1;
        validInput = true;
        
    }

    else if ( moveSelect.equals("s"))
    {
        randomRow += 1;
        validInput = true;
    }

    else if (moveSelect.equals("d"))
    {
        randomCol -= 1;
        validInput = true;
    }

    else
    {
        System.out.println("Invalid Entry. Try again.");
        validInput = false;
    }

} while (validInput == false);
gridArray[randomRow][randomCol] = 'X';
gridArray[randomRow2][randomCol2] = '*';

for (int i = 0; i < gridArray.length; i++)
{
    for (int j = 0; j < gridArray.length; j++)
    {       
        if (!((i == randomRow && j == randomCol) || (i == randomRow2 &&  j == randomCol2)))
        {
            gridArray[i][j] = 'o';
        }
        System.out.print(gridArray[i][j]);
    }
    System.out.println("");  
  }
 }
}