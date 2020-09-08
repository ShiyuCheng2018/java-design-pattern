package world.shiyu.principles.signleResponsibility;

public class singleResponsibility_2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();

        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        airVehicle.run("飞机");

        waterVehicle.run("快艇");
    }
}


/**
 * 方案二的分析
 * 1， 遵守了单一原职责则
 * 2， 但是这样的改动开销很大， 即将类分解， 同时需要修改客户端
 * 3， 改进： 直接修改Vehicle 类， 改动的代码会比较少　=> 方案3
 */


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}


class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}

