package hyl.hylnetwork.dao;

import hyl.hylnetwork.entity.Book;

import java.util.List;

public interface UserDao {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    void select();


    Book selectObj(String id);

    List<Book> selectList();

    void batchAdd(List<Object[]> list);


    void batchUpdate(List<Object[]> list);

    void batchDelete(List<Object[]> list);
}
