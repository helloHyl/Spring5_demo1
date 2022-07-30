package hyl.hylnetwork.dao;

import hyl.hylnetwork.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao  {

    //注入jdbctemplate
    @Autowired
//    @Qualifier根据名称注入 和autowired一起使用
//    @Resource 可以根据属性也可以根据名称
    private JdbcTemplate jdbcTemplate;





    //添加
    @Override
    public void add(Book book) {

        String sql = "insert into t_book values(?,?,?)";
        //第一个sql 语句 第二个可变参数  可变参数就是一个数组 也可以写在数组里面
        Object[] objects ={book.getUserId(),book.getUsername(),book.getUstatus()};
        //方式一
//        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());

        //方式二
        int update = jdbcTemplate.update(sql, objects);

        System.out.println(update);
    }

    //修改
    @Override
    public void update(Book book) {
            String sql ="update t_book set username=?,ustatus=?,user_id=?";
            Object[] objects ={book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, objects);
        System.out.println(update);
    }

    //删除
    @Override
    public void delete(String id) {
            String sql ="delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    //查询
    @Override
    public int selectCount() {
        String sql ="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAllBook(List<Object[]> bookList) {
        //        Object[] objects ={book.getUserId(),book.getUsername(),book.getUstatus()};
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, bookList);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> objects) {
        String sql ="update t_book set username=?,ustatus=?,where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(String[] strings) {
        
    }


}
