package com.getbookmarks.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by amarendra on 01/03/16.
 */
public class GetBookmarksWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(ApplicationConfig.class, WebMvcConfig.class);

        ServletRegistration.Dynamic dynamc = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
        dynamc.addMapping("/api/v1/*");
        dynamc.setLoadOnStartup(1);
    }

}

