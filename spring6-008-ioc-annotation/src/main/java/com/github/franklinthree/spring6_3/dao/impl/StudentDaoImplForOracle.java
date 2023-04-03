package com.github.franklinthree.spring6_3.dao.impl;

import com.github.franklinthree.spring6_3.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * 学生Daoimpl为甲骨文
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className StudentDaoImplForOracle
 * @see
 * @since 1.0.0
 */
@Repository
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("StudentDaoImplForOracle.deleteById");
    }
}
