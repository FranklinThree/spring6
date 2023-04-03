package com.github.franklinthree.spring6_3.dao.impl;

import com.github.franklinthree.spring6_3.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * 学生Daoimpl为我sql
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className StudentDaoImplForMySQL
 * @see
 * @since 1.0.0
 */
//@Repository
public class StudentDaoImplForMySQL implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("StudentDaoImplForMySQL.deleteById");
    }
}
