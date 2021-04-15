package com.wolken.wolkenapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { RestApplicationConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] {"/"};
	}

}
