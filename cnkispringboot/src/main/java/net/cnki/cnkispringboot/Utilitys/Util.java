package net.cnki.cnkispringboot.Utilitys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: cnkispringboot
 * @description:
 * @author: Yep
 * @create: 2022-03-22 14:14
 **/
public class Util {

    public static String  readFile(String path) throws IOException {
        File file = new File(path);

        StringBuilder result = new StringBuilder();


            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件

            String s = null;

            while((s = br.readLine())!=null){//使用readLine方法，一次读一行

                result.append(System.lineSeparator()+s);

            }

            br.close();

        return result.toString().replaceAll("(\\\r\\\n|\\\r|\\\n|\\\n\\\r)", "");
    }

    public static boolean ipCheck(String text) {
                if (text != null && !text.isEmpty()) {
                    String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
                    if (!text.matches(regex)) {
                        return false;
                    }
                }else{
                    return false;
                }


        return  true;

    }

}
