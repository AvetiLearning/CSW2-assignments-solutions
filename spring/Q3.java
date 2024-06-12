package spring;
// 3. Explain Dependency Injection with a java program for
// the following types of injection
// a)using setter getter methods
// b)using constructor

import org.springframework.context.ApplicationContext;
import org.springframework.context.XMLApplicationContext;

// Dependency Injection (DI) is a design pattern used to implement IoC. It allows a class to receive its dependencies from an external source rather than creating them internally.
// DI promotes loose coupling and enhances testability and maintainability.

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

class College{
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("College Name: " + name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        ApplicationContext context = new XMLApplicationContext("beans.xml");
        Student st = (Student) context.getBean("student");
        st.display();
        College clg = (College) context.getBean("college");
        clg.display();

    }
}

// <beans>
// <bean id="student" class="com.demo.Student">
//     <constructor-arg name="id" value=433 />
//     <constructor-arg name="name" value="John" />
// </bean>
// <bean id="iter" class="com.spring.College">
//     <property name="name" value="ITER College"/>
// </bean>
// </beans>