package com.github.franklinthree.spring6.biz;


import org.springframework.stereotype.Service;

/**
 * 贵宾服务
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className VipService
 * @see
 * @since 1.0.0
 */
@Service
public class VipService {
    
    public void saveUser(){
        System.out.println("保存会员...");
    }
    
    public void modifyUser(){
        System.out.println("修改会员...");
    }
    
    public void deleteUser(){
        System.out.println("删除会员...");
    }
    
    public void queryUser(){
        System.out.println("查询会员...");
    }
}
