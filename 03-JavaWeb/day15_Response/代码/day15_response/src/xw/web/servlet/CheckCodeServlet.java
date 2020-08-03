package xw.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int width = 100;
        int height = 50;


        //1.创建一个对象，在内存中的一张图片（验证码图片对象）
        // 参数：图片宽度 图片高度 图片的类型
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //2.美化图片
        //2.1 填充背景色
        Graphics g = image.getGraphics(); // 画笔对象
        g.setColor(Color.PINK); // 设置画笔颜色
        g.fillRect(0, 0, width, height); // 设置背景色

        //2.2 设置边框
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, width - 1, height - 1);

        //2.3 写验证码   随机生成验证码
        // 每循环一次，从该字符串随机获取一个字符
        String str = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789";
        // 创建一个随机数对象
        Random ran = new Random();

        for (int i = 1; i <= 4; i++) {
            // 生成随机角标
            int index = ran.nextInt(str.length());
            // 根据随机生成的角标，随机获取字符
            char ch = str.charAt(index);
            // 写验证码
            g.drawString(ch + "", width / 5 * i, height / 2);

        }

        //2.4 获取干扰线
        g.setColor(Color.GREEN);

        // 随机生成坐标点
        for (int i = 0; i < 10; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);

            g.drawLine(x1, y1, x2, y2);
        }

        //3.将图片输出到页面展示
        // ImageIO对象可以调用write()方法，将内存中的图片写到页面或任意流中
        ImageIO.write(image, "jpg", response.getOutputStream());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
