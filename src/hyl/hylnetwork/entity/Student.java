package hyl.hylnetwork.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

//使用注解方式 生成没有设置属性名称的话 默认为类名首字母小写
@Component                        //工厂bean        //后置处理器
public class Student implements FactoryBean, BeanPostProcessor {

    private String age;
    private  String name;
    private String id;

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public Object getObject() throws Exception {
        Student student = new Student();
        return student;

    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后");
        return bean;
    }
}
