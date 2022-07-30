package hyl.hylnetwork.dao;

import hyl.hylnetwork.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加
    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] objects = {book.getUserId(),book.getUsername(),book.getUstatus()};
        jdbcTemplate.update(sql,objects);
    }

    @Override
    public void update(Book book) {
        //修改
        String sql = "update t_book set username=?,ustatus=?,user_id=?";
        Object[] objects = {book.getUsername(),book.getUstatus(),book.getUserId()};
        jdbcTemplate.update(sql,objects);

    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void select() {
        String sql ="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    @Override
    public Book selectObj(String id) {

        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> selectList() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return books;
    }

    @Override
    public void batchAdd(List<Object[]> list) {
        String sql = "insert into t_book values(?,?,?)";
        jdbcTemplate.batchUpdate(sql,list);
    }

    @Override
    public void batchUpdate(List<Object[]> list) {
        String sql ="update t_book set username=?,ustatus=?where user_id=?";
        jdbcTemplate.batchUpdate(sql,list);
    }

    @Override
    public void batchDelete(List<Object[]> list) {
        String sql = "delete from t_book where user_id=?";
        jdbcTemplate.batchUpdate(sql,list);
    }


}
