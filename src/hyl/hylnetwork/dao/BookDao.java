package hyl.hylnetwork.dao;

import hyl.hylnetwork.entity.Book;

import java.util.List;

public interface BookDao {

    //添加的方法
    void add(Book book);

    //修改的方法
    void update(Book book);

    //删除的方法
    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAllBook(List<Object[]> bookList);


    void batchUpdateBook(List<Object[]> objects);

    void batchDeleteBook(String[] strings);


    //查询的方法

}
