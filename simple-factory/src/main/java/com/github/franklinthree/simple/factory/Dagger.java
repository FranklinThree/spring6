package com.github.franklinthree.simple.factory;

/**
 * 匕首
 * 具体产品角色
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class Dagger extends Weapon{
	@Override
	public void attack() {
		System.out.println("砍丫的！！！");
	}
}
