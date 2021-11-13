package t2;

/**
 * Project name(项目名称)：练习_继承与多态
 * Package(包名): t2
 * Class(类名): SystemUpdate
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:52
 * Version(版本): 1.0
 * Description(描述)：
 * 使用构造方法初始化类。
 * 在Salary类使用super关键字调用父类的方法。
 * 定义introduction方法介绍员工信息，格式见测试样例。
 * 测试输入：
 * 张三 1995.07 程序员 4500
 * 预期输出：
 * 员工姓名：张三 出生年月：1995.07 职位：程序员 薪水：4500.0
 * 注：各项之间用空格隔开，冒号使用中文字符。
 */

import java.awt.*;
import java.util.Scanner;

/********** Begin *********/
class Employee
{
    private String name;
    private String birth;
    private String position;

    public Employee()
    {

    }

    public Employee(String name, String birth, String position)
    {
        this.name = name;
        this.birth = birth;
        this.position = position;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBirth()
    {
        return birth;
    }

    public void setBirth(String birth)
    {
        this.birth = birth;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }
}

class Salary extends Employee
{
    private double salary;

    public Salary()
    {
        super();
    }

    public Salary(String name, String birth, String position, double salary)
    {
        super(name, birth, position);
        this.salary = salary;
    }

    public void introduction()
    {
        //员工姓名：张三 出生年月：1995.07 职位：程序员 薪水：4500.0
        // * 注：各项之间用空格隔开，冒号使用中文字符。
        System.out.println("员工姓名：" + super.getName() + " 出生年月："
                + super.getBirth() + " 职位：" + super.getPosition() + " 薪水：" + this.salary);
    }
}

/********** End *********/


public class SystemUpdate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String birth = input.next();
        String position = input.next();
        double salary;// = input.nextDouble();
        //控制台输入变量:salary
        int errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:1000000000000
                System.out.print("请输入薪水：");
                salary = input.nextDouble();
                if (salary >= 0 && salary <= 1000000000000.0)
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
                    System.out.println("输入的数据不在范围内! 范围：[0,1000000000000]");
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
        Salary employee = new Salary(name, birth, position, salary);
        employee.introduction();
    }
}
