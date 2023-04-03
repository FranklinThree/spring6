package com.github.franklinthree.spring6_3.service;

import com.github.franklinthree.spring6_3.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 学生服务
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className StudentService
 * @see
 * @since 1.0.0
 */
@Service
public class StudentService {
//    @Resource(name = "studentDaoImplForMySQL")
    private StudentDao studentDao;


    // @Resource 不能出现在构造方法上，因为构造方法是在对象创建的时候调用的，而@Resource是在对象创建之后，依赖注入的时候调用的。
//    public StudentService(@Resource(name = "studentDaoImplForMySQL") StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
    @Resource

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void deleteStudent(){
        studentDao.deleteById();
        System.out.println("StudentService.deleteStudent");
    }

}
