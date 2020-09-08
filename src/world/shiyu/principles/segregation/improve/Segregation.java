package world.shiyu.principles.segregation.improve;

public class Segregation {
    public static void main(String[] args){
        A a = new A();
        a.depend_1(new B()); // A类通过接口去依赖B类
        a.depend_2(new B());
        a.depend_3(new B());

        C c = new C();  // C类通过接口去依赖（使用）D类
        c.depend_1(new D());
        c.depend_4(new D());
        c.depend_5(new D());
    }
}

/**
 * 按照隔离原则应当这样处理：
 * 将接口interface_1拆分为独立对几个接口， 类A和类C分别与他们需要对接口进行依赖关系。 也就是采取隔离原则。
 */
interface Interface_1 {
    void operation_1();
}

interface Interface_2 {
    void operation_2();
    void operation_3();
}

interface Interface_3 {
    void operation_4();

    void operation_5();
}

class B implements Interface_1, Interface_2 {
    public void operation_1() {
        System.out.println("B 中实现了operation_1");
    }

    public void operation_2() {
        System.out.println("B 中实现了operation_2");
    }

    public void operation_3() {
        System.out.println("B 中实现了operation_3");
    }
}


class D implements Interface_1, Interface_3 {
    public void operation_1() {
        System.out.println("D 中实现了operation_1");
    }

    public void operation_4() {
        System.out.println("D 中实现了operation_4");
    }

    public void operation_5() {
        System.out.println("D  中实现了operation_5");
    }
}

class A { // A 类只会通过接口interface_1, Interface_2 依赖（使用）B类， 但是只会用到1， 2， 3方法
    public void depend_1(Interface_1 i) {
        i.operation_1();
    }

    public void depend_2(Interface_2 i) {
        i.operation_2();
    }

    public void depend_3(Interface_2 i) {
        i.operation_3();
    }
}

class C { // C 类只会通过接口interface_1, Interface_3 依赖（使用）B类， 但是只会用到1， 4， 5方法
    public void depend_1(Interface_1 i) {
        i.operation_1();
    }

    public void depend_4(Interface_3 i) {
        i.operation_4();
    }

    public void depend_5(Interface_3 i) {
        i.operation_5();
    }
}
