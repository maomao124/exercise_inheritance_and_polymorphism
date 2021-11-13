package t3;

/**
 * Project name(项目名称)：练习_继承与多态
 * Package(包名): t3
 * Class(类名): CatAndDog
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 14:06
 * Version(版本): 1.0
 * Description(描述)：
 * 使用多态的方式调用对象成员方法。
 * 依次输出猫吃的东西、猫做的事情、狗吃的东西、狗做的事情，格式见测试样例。
 * 测试输入：
 * <p>
 * 预期输出：
 * 吃鱼
 * 抓老鼠
 * 吃骨头
 * 看家
 */


abstract class Animal
{
    abstract void eat();

    abstract void work();
}

/********** Begin *********/
class Cat extends Animal
{

    @Override
    void eat()
    {
        System.out.println("吃鱼");
    }

    @Override
    void work()
    {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal
{

    @Override
    void eat()
    {
        System.out.println("吃骨头");
    }

    @Override
    void work()
    {
        System.out.println("看家");
    }
}

/********** End *********/

public class CatAndDog
{
    public static void main(String[] args)
    {
        /********** Begin *********/
        Animal cat = new Cat();
        Animal dog = new Dog();
        /********** End *********/
        cat.eat();
        cat.work();
        dog.eat();
        dog.work();
    }
}
