package world.shiyu.principles.signleResponsibility;

public class SingleResponsibility_3 {
    public static void main(String[] args) {
        Vehicle_2 vehicle = new Vehicle_2();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.fly("飞机");
        vehicle.sailing("快艇");
    }
}

/**
 * 方式3
 * 1， 这种方式没有对原来的类做大修改， 只是增加了方法
 * 2， 这里虽然没有在类这个级别上遵守单一职责原则， 但是在方法级别上遵守了单一职责
 */

class Vehicle_2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }

    public void fly(String vehicle) {
        System.out.println(vehicle + " 在天空上飞行....");
    }

    public void sailing(String vehicle) {
        System.out.println(vehicle + " 在水面上航行....");
    }
}