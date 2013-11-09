/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/11/13
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */
public class Target {

    private int[][][] array;

    public Target(int x, int y, int z) {
        array = new int[x][y][z];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int n = 0; n < array[0][0].length; n++) {
                    array[i][j][n] = 0;
                }
            }
        }
    }

    public void init() {

        int heightDim = (int) Math.abs(array.length * Math.random());
        int lengthDim = (int) Math.abs(array[0].length * Math.random());
        int widthDim = (int) Math.abs(array[0][0].length * Math.random());
        array[heightDim][lengthDim][widthDim] = 1;
    }

    public Result fire(int p1, int p2, int p3) {
        int leftRight = 0;
        int highLow = 0;
        int shortLong = 0;
        boolean onTargetLeftRight = false;
        boolean onTargetHighLow = false;
        boolean onTargetShortLong = false;
        if ((p1 > array.length || p1 < 0) || (p2 > array[0].length || p2 < 0) || (p3 > array[0][0].length || p2 < 0)) {

            return Result.OUT_OF_RANGE;

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int n = 0; n < array[0][0].length; n++) {
                    if (array[i][j][n] == 1) {
                        highLow = i;
                       leftRight= j;
                        shortLong = n;
                    }
                }
            }
        }
        if (p2 == leftRight) {
            onTargetLeftRight = true;
        } else if (p2 > leftRight) {
            return Result.FAIL_LEFT;
        } else {
          return Result.FAIL_RIGHT;
        }
        if (p1 == highLow) {
            onTargetHighLow = true;
        } else if (p1 > highLow) {
            return Result.FAIL_LOW;
        } else {
            return Result.FAIL_HIGH;
        }
        if (p3 == shortLong) {
            onTargetShortLong = true;
        } else if (p3 > shortLong) {
            return Result.FAIL_LONG;
        } else {
            return Result.FAIL_SHORT;
        }
        if (onTargetLeftRight && onTargetHighLow && onTargetShortLong) {

            return Result.HIT;
        }
     throw new RuntimeException();
    }


    public static void main(String[] args) {
    Target myTarget=new Target(10, 10, 10);
    myTarget.init();
    //myTarget.array[1][2][3]=1;
    boolean finished=false;
    while(!finished){
    System.out.println("Here they come! Try to bring the plane down!");
    System.out.print("Enter coordinate X: ");
    int x=Integer.parseInt(System.console().readLine());
    System.out.print("Enter coordinate Y: ");
    int y=Integer.parseInt(System.console().readLine());
    System.out.print("Please enter coordinate Z: ");
    int z=Integer.parseInt((System.console().readLine()));
    Result result=myTarget.fire(x,y,z);
    switch(result){
        case OUT_OF_RANGE:
            System.out.println("This shot is way out of range! Try harder.");
            break;
        case FAIL_LEFT:
            System.out.println("You missed! The target is to the left");
            break;
        case FAIL_RIGHT:
            System.out.println("You missed! The target is to the right");
            break;
        case FAIL_LOW:
            System.out.println("You missed! The target is higher");
            break;
        case FAIL_HIGH:
            System.out.println("You missed! The target is lower");
            break;
        case FAIL_LONG:
            System.out.println("You missed! The target is closer!");
            break;
        case FAIL_SHORT:
            System.out.println("You missed! The target is farther!");
            break;
        case HIT:
            System.out.println("You hit it! Well done!");
            System.out.print("Would you like to play again?");
            if(System.console().readLine().equals("n")){
                finished=true;
            }
            break;
            }
        }
    }
}
















