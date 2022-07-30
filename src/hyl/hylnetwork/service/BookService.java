package hyl.hylnetwork.service;

import hyl.hylnetwork.dao.BookDao;
import hyl.hylnetwork.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired//根据属性进行注入 但是存在弊端如果实现类有多个
    private BookDao bookDao;


        //添加的方法
    public void addBook(Book book){
        bookDao.add(book);

    }
    //修改的方法
    public  void  updateBook(Book book){
        bookDao.update(book);
    }
    //删除的方法
    public void  deleteBook(String id){
        bookDao.delete(id);
    }

    //查询的方法
    public  int  findCount(){
        return bookDao.selectCount();
    }
    //查询对象 比如图书馆查询图书详情
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
    //查询集合
    public List<Book> findAll(){

        return bookDao.findAllBook();
    }
    //批量添加
    public void batchAdd(List<Object[]> bookList){
        bookDao.batchAllBook(bookList);

    }

    //批量修改
    public void  bathUpdate(List<Object[]> objects){
        bookDao.batchUpdateBook(objects);
    }

    //批量删除

}
