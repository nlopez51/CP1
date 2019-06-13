public class Grid{
    public static int twoArray(int[]scores){
        int[][]Scores = {{23,78,9,56}, {7,83,43,87},{74,2,3,27}};
        for(int row = 0; row < scores.length; row++){
            for(int col = 0; col < scores[0].length; col++){
                System.out.print(scores[row][col] + " ");
            }
            System.out.println();


       }

    }
}

