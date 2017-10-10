package org.felight.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor2 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DemoBeanPostProcessor2 processing bean instance after initialization" +
	    "(i.e just after init life cycle event)of:" +beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DemoBeanPostProcessor2 processing bean instance before initialization" +
	    "(i.e after spring instantiates bean and before init life cycle event)of:" +beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
