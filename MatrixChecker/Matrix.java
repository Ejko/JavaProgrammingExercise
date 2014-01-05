package MatrixChecker;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/11/13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class Matrix {

    private int [][] array2D;

    public Matrix(int rows, int cols){
        array2D=new int [rows][cols];
        for(int n=0; n<rows;n++){
            for(int t=0;t<cols;t++){
                array2D[n][t]=1;
            }

        }
    }
    public void setElement(int a, int b, int c){
        if((a>array2D.length)||(b>array2D[0].length)){
            System.out.println("Invalid indices, try again");
        }
        else {
            array2D[a][b]=c;
        }
    }
    public void setRow(int rowPos, String listNums){
        //split the string into an array of strings, leaving out commas
        String [] listString=listNums.split(",");
        int [] listNumbers;
        listNumbers=new int[listString.length];
        for(int i=0; i<listString.length;i++){
          listNumbers[i]=Integer.parseInt(listString[i]);
        }
        if((rowPos>array2D.length)||(listNumbers.length!=array2D[rowPos].length)){
            System.out.println("The row index provided does not exist or the numbers provided are more than the columns.. ");
        }
        else{
            for(int i=0; i<array2D[rowPos].length;i++){
                array2D[rowPos][i]=listNumbers[i];
            }
        }
    }
    public void setColumn(int colPos, String listNums){
        String [] listString=listNums.split(",");
        int [] listNumbers;
        listNumbers=new int [listString.length];
        for(int i=0;i< listString.length;i++){
            listNumbers[i]=Integer.parseInt(listString[i]);
         }

        //Note: array2d[0] will only provide the number of columns on the first row
        if((colPos>array2D[0].length)||listNumbers.length!=array2D.length){
            System.out.println("The col index is invalid or the numbers provided are more than num of rows");
        }
        else{
            for(int i=0; i<array2D.length;i++){
                array2D[i][colPos]=listNumbers[i];
            }
        }
    }
    public String[] toNewString(){
        String [] array2DtoString= new String[array2D.length];
        for(int s=0; s<array2D.length;s++){
            array2DtoString[s]=Arrays.toString(array2D[s]);
            }
        return array2DtoString;
    }

    public void prettyPrint(){
        for(int i=0;i<array2D.length;i++){
            String arrayRow=Arrays.toString(array2D[i]);
            System.out.println(arrayRow + '\t');
        }

    }

    public static void main(String [] args){

    }
}
