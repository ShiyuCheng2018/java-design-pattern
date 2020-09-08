package world.shiyu.principles.signleResponsibility;

public class singleResponsibility_1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}


/**
 * 交通工具类
 * 方法一
 * 1, 在方法一中run违反了单一职责原则
 * 2， 解决方案非常简单， 根据交通工具的运行方式不同， 分解成不同的类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }
}




