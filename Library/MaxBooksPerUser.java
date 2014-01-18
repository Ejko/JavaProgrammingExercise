package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
public enum MaxBooksPerUser {

        MAX_BOOKS_PER_USER(5);

        private int num;

        MaxBooksPerUser(int num){
            this.num=num;
        }

        public int getNum(){
            return num;
        }

        public void setNum(int newNum){
            this.num=newNum;
        }
}
