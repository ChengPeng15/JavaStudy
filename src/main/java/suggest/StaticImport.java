package suggest;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;
import static java.lang.System.out;

/**
 * Created by bjchengpeng on  2018/1/18.
 */

/*
少用静态导入
 */
public class StaticImport {

    public static void main(String[] args) {
        out.println(1);
//        out.println(Integer.MAX_VALUE);
//        out.println(Integer.toHexString(42));
        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }

}