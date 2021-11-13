package t1;

/**
 * Project name(项目名称)：练习_继承与多态
 * Package(包名): t1
 * Class(类名): ShapeTrouble
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:36
 * Version(版本): 1.0
 * Description(描述)：
 * 将Shape类定义为抽象类，Shape类的getAcreage()方法（获取面积）定义为抽象方法。
 * 将Circle类和Rectangle类定义为Shape类的子类，分别重写Shape类的抽象方法getAcreage()，返回各自的面积。
 * PI取3.1415926.
 * 特别注意：由于类型精度的问题，计算圆的面积的时候，请使用 PI * r * r
 * <p>
 * 评测说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 测试输入：
 * 2
 * 2 3
 * 预期输出：
 * 12.5663704
 * 6.0
 */

import java.awt.*;
import java.util.Scanner;

/********** Begin *********/


abstract class Shape
{
    public abstract double getAcreage();
}

class Circle extends Shape
{
    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0;
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0;
        }
    }

    @Override
    public double getAcreage()
    {
        final double PI = 3.1415926;
        return PI * this.radius * this.radius;
    }

}

class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle()
    {

    }

    public Rectangle(double length, double width)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    @Override
    public double getAcreage()
    {

        return length * width;

    }
}

/********** End *********/

public class ShapeTrouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius;// = scanner.nextDouble();
        //控制台输入变量:radius
        int errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:100000000
                System.out.print("请输入半径：");
                radius = input.nextDouble();
                if (radius >= 0 && radius <= 100000000)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    System.out.println("输入的数据不在范围内! 范围：[0,100000000]");
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 5)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
        }
        double length;// = input.nextDouble();
        //控制台输入变量:length
        errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:10000000
                System.out.print("请输入长度：");
                length = input.nextDouble();
                if (length >= 0 && length <= 10000000)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    System.out.println("输入的数据不在范围内! 范围：[0,10000000]");
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 5)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
        }
        double width;// = input.nextDouble();
        //控制台输入变量:width
        errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:1000000
                System.out.print("请输入宽度：");
                width = input.nextDouble();
                if (width >= 0 && width <= 1000000)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    System.out.println("输入的数据不在范围内! 范围：[0,1000000]");
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 5)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
        }
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println(circle.getAcreage());
        System.out.println(rectangle.getAcreage());
    }
}
