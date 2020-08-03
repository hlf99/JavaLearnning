package xw.web.utils;

//import sun.misc.BASE64Encoder; // 该处的BASE64Encoder类无法导入？
// 从jdk1.8开始，就用 java.util.Base64 工具类来替换 sun.misc.BASE64Encoder 了

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class DownLoadUtils {

    public static String getFileName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            // 火狐浏览器
//            BASE64Encoder base64Encoder = new BASE64Encoder();
//            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
        } else {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
