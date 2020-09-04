package EMP.dao;

import EMP.domain.User;

import java.util.List;

public interface IUserDao
{
    List<User>findAll();

    User findById(Integer EMPNO);

     int insertUser(User user);

     int updateUser(User user);

     int deleteUser(Integer EMPNO);

     List<User>findLikeName(String ENAME);

     int count();
}
