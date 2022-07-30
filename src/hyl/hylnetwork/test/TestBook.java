package hyl.hylnetwork.test;

import hyl.hylnetwork.entity.Book;
import hyl.hylnetwork.entity.Student;
import hyl.hylnetwork.entity.User;
import hyl.hylnetwork.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void  testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //ioc理解把对象创建和对象之间的调用交给spring管理

        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        Book book1 = context.getBean("book", Book.class);
//        System.out.println(book1.getUserId()+"\t"+book1.getUsername()+"\t"+book1.getUstatus());

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java_1");
//        book.setUstatus("work");
//            bookService.updateBook(book);

        //删除
//        bookService.deleteBook("1");

        //查询
//        int count = bookService.findCount();
//        System.out.println("数据表"+count);
        //查询对象
       //调用spring的jdbc模板再调用book的set方法
        Book one = bookService.findOne("1");
        System.out.println(one);
//        Book one1 = bookService.findOne("2");
//        System.out.println(one1);

        //查询集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> bookList = new ArrayList<>();
//        Object[] o1 ={"5","java","work"};
//        Object[] o2 ={"6","c","work"};
//        Object[] o3 ={"7","php","work"};
//        bookList.add(o1);
//        bookList.add(o2);
//        bookList.add(o3);
//
//        bookService.batchAdd(bookList);


      //  批量修改

    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user = context.getBean("user", User.class);
        user.showUser();


    }


}
