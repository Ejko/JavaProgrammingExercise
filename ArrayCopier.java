import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/11/13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
public class ArrayCopier {

    public void copy(int [] src, int [] dst){
        for(int i=0; i<src.length;i++){
            if(i==dst.length){
                System.out.println("The destination string is too small, the last element copied is: " + src[i-1]);
            break;
            }
            dst[i]=src[i];

        }
    System.out.print("The elements of source string are: ");
    System.out.println(Arrays.toString(src));
    System.out.print("The elements of the destination string are: ");
    System.out.println(Arrays.toString(dst));
    }
    public static void main(String [] args){
        int [] src ={1,2,3,4,5,6,7,8,9,10};
        int [] dst;
        dst=new int[5];
        ArrayCopier copier1=new ArrayCopier();
        copier1.copy(src, dst);
        int [] src1={5,6,7};
        int [] dst1;
        dst1=new int[7];
        ArrayCopier copier2=new ArrayCopier();
        copier2.copy(src1, dst1);
        int [] src2={10,12,13,14,15};
        int [] dst2;
        dst2=new int[5];
        ArrayCopier copier3=new ArrayCopier();
        copier3.copy(src2, dst2);

    }
}

