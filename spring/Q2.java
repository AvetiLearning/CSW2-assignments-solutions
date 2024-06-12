package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.XMLApplicationContext;

// Explain Inversion of Control with a java program.
// Inversion of Control (IoC) is a design principle used in software development where the control flow of a program is inverted compared to traditional procedural programming.
// In traditional programming, the main program controls the flow and calls the required functions or classes. With IoC, an external entity (like a framework or container) manages the control flow and object creation,
// promoting loose coupling and easier maintainability.

// The Spring Framework uses IoC to manage the creation and lifecycle of objects, allowing developers to define how dependencies are injected, rather than instantiating and managing them manually.

class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}

public class Q2{
    public static void main(String[] args) {
        ApplicationContext context = new XMLApplicationContext("beans.xml");
        Student st = (Student) context.getBean("student");
        st.display();
    }
}

// <beans>
// <bean id="student" class="com.demo.Student">
//     <constructor-arg name="id" value=433 />
//     <constructor-arg name="name" value="John" />
// </bean>
// </beans>