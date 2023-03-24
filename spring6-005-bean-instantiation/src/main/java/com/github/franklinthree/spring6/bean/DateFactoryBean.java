package com.github.franklinthree.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBean implements FactoryBean<Date> {
	// DateFactoryBean这个工厂Bean协助我们Spring创建这个普通的Bean：Date。

	private final String dateStr;

	public DateFactoryBean(String dateStr) {
		this.dateStr = dateStr;
	}

	@Override
	public Date getObject() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

//	@Override
//	public boolean isSingleton() {
//		return FactoryBean.super.isSingleton();
//	}
}
