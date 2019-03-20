package ds;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class UserMapperTest {

    @Test
    //插入数据
    public void testInsert(){
        SqlSessionFactory factory=MybatisUtils.getFactory();
        SqlSession session=factory.openSession(true);
        //使用反射的方法
        UserMapper mapper=session.getMapper(UserMapper.class);
        mapper.insertT(new User(-1, "p", 4));

        session.close();
    }

    @Test
    //删除数据
    public void testDelete(){
        SqlSessionFactory factory=MybatisUtils.getFactory();
        SqlSession session=factory.openSession(true);
        UserMapper mapper=session.getMapper(UserMapper.class);
        mapper.deleteById(1);
        session.close();
    }

    @Test
    //修改数据
    public void testUpdate(){
        SqlSessionFactory factory=MybatisUtils.getFactory();
        SqlSession session=factory.openSession(true);
        UserMapper mapper=session.getMapper(UserMapper.class);
        mapper.updateT(new User(2, "jjjjj", 232));
        session.close();
    }

    @Test
    //获取一条数据
    public void testGetUser(){
        SqlSessionFactory factory=MybatisUtils.getFactory();
        SqlSession session=factory.openSession(true);
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user=mapper.getUser(2);
        session.close();
        System.out.println(user);
    }

    @Test
    //获取所有数据
    public void testGetAllUsers(){
        SqlSessionFactory factory=MybatisUtils.getFactory();
        SqlSession session=factory.openSession(true);
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> users=mapper.getAllUsers();

        session.close();
        System.out.println(users);
    }
}