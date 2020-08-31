package com.javaDesignPattern.decoratorPattern;

/**
 * 装饰者模式是一种用于替代继承的技术，通过一种无须定义子类的方式来给对象动态增加职责
 * 使用对象之间的关联关系来取代类之间的继承关系，降低了系统的耦合度
 * 使需要装饰的具体构件类和用于装饰的具体装饰类都可以独立变化，增加和减少都方便
 * 符合开闭原则
 */
public class DecoratorTest {
    /**
     * 抽象构件类：是具体构件和抽象装饰类的共同父类，声明在具体构件中实现的业务方法
     * 典型实现如下：
     */
    public abstract class Component{
        public abstract void operation();
    }

    /**
     * 具体构件类：是抽象构件类的子类，用于定义具体的构件对象，实现在抽象构件中声明的方法
     * 装饰类可以增加额外的职责（方法）
     * 典型实现如下：
     */

    public class ConcreteComponent extends Component{
        @Override
        public void operation() {
            //基本功能实现
        }
    }

    /**
     * 抽象装饰类：也是抽象构件类的子类，用于给具体构件增加职责，
     * 具体职责在其子类实现，维护一个指向抽象构件类对象的引用，
     * 通过该引用可以调用装饰之前的构件对象，通过其子类拓展该方法以达到装饰的目的
     * 典型实现如下：
     */
    public class Decorator extends Component{
        //维持一个对抽象构件对象的引用
        private Component component;
        //注入一个抽象构件类型的对象
        public Decorator (Component component){
            this.component = component;
        }

        /**
         * 并未真正实现operation()方法，只是调用原有component对象的该方法
         * 没有真正实施装饰，而是提供一个统一的接口将具体的装饰过程交给子类完成
         */
        public void operation(){
            //调用原有业务方法
            component.operation();
        }

        /**
         * 具体装饰类：负责向构件添加新的职责，每一个具体装饰类都定义一些新的行为
         *可以调用在抽象装饰类中定义的方法，并可以增加新的方法用于扩充对象的行为
         */
        public class ConcreteDecorator extends Decorator{
            public ConcreteDecorator(Component component){
                super(component);
            }

            @Override
            public void operation() {
                //调用原有的业务方法
                super.operation();
                //调用新增业务方法
                addedBehavior();
            }

            //新增业务方法
            public void addedBehavior(){

            }
        }
    }
}
