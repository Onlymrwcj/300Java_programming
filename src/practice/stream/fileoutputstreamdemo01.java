package practice.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author guiqing
 * @version 1.0
 * @className fileoutputstreamdemo01
 * @description TODO
 * @since 2021/9/2 4:35 下午
 */
public class fileoutputstreamdemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //fileoutstream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos=new FileOutputStream("src/practice/stream/fos.txt");
        fos.write(97);
        fos.close();
    }
}
