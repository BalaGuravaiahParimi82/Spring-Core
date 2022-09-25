package com.seleniumexpress.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyRestAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] ConfigFiles = {MyRestAppconfig.class};
		return ConfigFiles;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String [] {"/"};
	}

}
