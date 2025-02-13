
# 七大方法原则
设计模式原则，其实就是程序员在编程时， 应当遵守的原则， 也是各种设计模式的基础（即：
设计模式为什么这样设计的依据）

##设计模式常用的七大原则有：
* 单一职责原则
* 接口隔离原则
* 依赖倒转（倒置）原则
* 里氏替换原则
* 开闭原则
* 迪米特法则
* 合成复用原则

## 1，单一职责原则 (Single Responsibility)
* 降低类的复杂度， 一个类只负责一项职责
* 提高类度可读性， 可维护性
* 降低变更的副作用及风险
* 通常情况下， 我们应当遵守单一职责原则， 只有逻辑足够简单，才可以在代码级别违反单一职责原则
；只有类中方法数量足够少， 可以在方法级别保持单一职责原则。

## 2, 接口隔离原则（Interface Segregation Principle）
客户端不应该依赖它不需要的接口， 即一个类对另一个类对依赖应该建立在最小接口上。

