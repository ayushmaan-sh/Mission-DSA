package MissionDSA.TwoDimensionalArray;
import java.util.*;
public class IntroOf2D {

//   searching a value in a matrix (2D Array).
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Oops, Key Not found !");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
    //We can also write -> int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        //Number of Columns
        for(int i=0; i<n; i++){
            //Number of Rows
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 10);
    }

}
