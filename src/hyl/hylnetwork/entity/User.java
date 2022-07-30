package hyl.hylnetwork.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "user")
@Aspect
public class User {
                                //
    public void pointDemo(){

    }

    @Autowired
    private List<Student[]> list;


    public void setList(List list) {
        this.list = list;
    }
    public void showUser(){
        System.out.println(list);


    }
}
