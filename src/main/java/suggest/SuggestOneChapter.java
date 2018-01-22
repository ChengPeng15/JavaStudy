package suggest;

/**
 * Created by bjchengpeng on  2018/1/18.
 */
public class SuggestOneChapter {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;//0
//            count = ++count;//10
//            count++;//10
//            ++count;//10
        }
        System.out.println("count:" + count);
    }
}