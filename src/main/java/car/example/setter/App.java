package car.example.setter;

import car.example.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBeanSetterContext.xml");

        car.example.setter.Car myCar = (car.example.setter.Car) context.getBean("myCar");
        myCar.showDetails();
    }
}
