package hyl.hylnetwork.test;

import hyl.hylnetwork.entity.Book;
import hyl.hylnetwork.service.BookService;
import hyl.hylnetwork.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class TestUser {



    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService service = context.getBean("userService", UserService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUstatus("work");
//        book.setUsername("a");
//
//
//        service.add(book);

//
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java_up");
//        book.setUstatus("work");
//        service.update(book);


//        service.delete("1");


//        service.select();


//        Book book = service.selectObj("1");
//        System.out.println(book);

//        List<Book> books = service.selectList();
//        System.out.println(books);

//        List<Object[]> list = new ArrayList<>();
//        Object[] o1 = {"4","java_4","work"};
//        Object[] o2 = {"5","java_5","work"};
//        Object[] o3 = {"6","java_6","work"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//
//        service.batchAdd(list);

        List<Object[]> list = new ArrayList<>();
        Object[] o1 ={"4"};
        Object[] o2 ={"5"};
        Object[] o3 ={"6"};
        list.add(o1);
        list.add(o2);
        list.add(o3);

        service.batchDelete(list);
    }
}
