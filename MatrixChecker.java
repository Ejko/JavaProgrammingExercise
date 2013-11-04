/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/11/13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class MatrixChecker {

    //private int [] array1;
  //  private int [][] array2;

    public MatrixChecker(int ind){
        int [] array1;
        array1=new int [ind];
    }

    public MatrixChecker(int rows, int cols){
        int [][] array2;
        array2=new int [rows] [cols];
    }

    public boolean isSymmetrical(int[]arr){
        boolean isSymmetrical=true;
        for(int n=0; n<arr.length;n++){
            if(n==arr.length-(n+1)){
                break;
            }
            else if(isSymmetrical && arr[n]!=arr[arr.length-(n+1)]){
                isSymmetrical=false;
            }

        }
        return isSymmetrical;
    }

    public boolean isSymmetrical(int[][]arr1 ){
        boolean isSymmetrical=true;
        for(int n=0; n<arr1.length;n++){
            for(int j=0; j<arr1[0].length;j++){
                if (isSymmetrical && arr1[n][j]!=arr1[j][n]){
                    isSymmetrical=false;
                }
            }
        }
        return isSymmetrical;
    }

    public boolean isTriangular(int [][] arr2){
        boolean isTriangular=true;
        for(int n=0; n<arr2.length;n++){
            for(int j=0; j<arr2[0].length;j++){
                if(isTriangular&&(n>j)&&(arr2[n][j]!=0)){
                    isTriangular=false;
                }

            }
        }
        return isTriangular;
    }

    public static void main(String [] args){

    }
}

