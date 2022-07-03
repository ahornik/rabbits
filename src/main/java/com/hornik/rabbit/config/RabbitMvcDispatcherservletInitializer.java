package com.hornik.rabbit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RabbitMvcDispatcherservletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ConfigRabbit.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/"};
	}

}
