/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class IntegerNodeDouble {

        private int n;
        private IntegerNodeDouble nextInteger;
        private IntegerNodeDouble previousInteger;

        public IntegerNodeDouble(int n){
            this.n=n;
            nextInteger=null;
            previousInteger=null;
        }

        public int getNumber(){
            return n;
        }

        public IntegerNodeDouble getNext(){
            return nextInteger;
        }

        public void setNext(IntegerNodeDouble n){
            this.nextInteger=n;
        }

        public void setPrevious(IntegerNodeDouble k){
            this.previousInteger=k;
        }
        public IntegerNodeDouble getPrevious(){
            return previousInteger;
        }
    }


