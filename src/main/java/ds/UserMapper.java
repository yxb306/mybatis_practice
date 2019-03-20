package ds;


import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;


public interface UserMapper {

    /*
     * 这是基于注解的映射方式，实现对数据的增删改查，将sql语句直接写在注解的括号中
     * 这是一个接口，其不需要类去实现它
     * 下边分别是插入，删除，修改，查询一个记录，查询所有的记录
     * */

    @Insert("insert into users(name,age) values(#{name},#{age})")
    public void insertT(User user);

    @Delete("delete from users where id=#{id}")
    public void deleteById(int id);

    @Update("update users set name=#{name},age=#{age} where id=#{id}")
    public void updateT(User user);

    @Select("select id,name,age from users where id=#{id}")
//    @Results(value = { @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),})
    public User getUser(int id);

    @Select("select id,name,age from users")
    public List<User> getAllUsers();
}