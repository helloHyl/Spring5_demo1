package hyl.hylnetwork.service;

import hyl.hylnetwork.dao.UserDao;
import hyl.hylnetwork.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserDao userDao;

    //添加
    public void  add(Book book){
        userDao.add(book);

    }
    //修改
    public  void  update(Book book){

        userDao.update(book);

    }
    //删除
    public void  delete(String id){
        userDao.delete(id);
    }

    //查找
    public  void  select(){
        userDao.select();


    }
    //查找对象
    public  Book selectObj(String id){

            return userDao.selectObj(id);

    }
    //查询集合
    public List<Book> selectList(){
        return userDao.selectList();


    }

    //批量增加
    public void batchAdd(List<Object[]> list){
        userDao.batchAdd(list);


    }
    //批量修改
    public  void  batchUpdate(List<Object[]> list){
        userDao.batchUpdate(list);
    }
    //批量删除
    public  void  batchDelete(List<Object[]> list){
        userDao.batchDelete(list);
    }
}
