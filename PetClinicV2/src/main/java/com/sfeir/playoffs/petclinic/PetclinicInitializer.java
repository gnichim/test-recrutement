package com.sfeir.playoffs.petclinic;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;

/**
 * In Servlet 3.0+ environments, this class replaces the traditional {@code web.xml}-based approach in order to configure the
 * {@link ServletContext} programmatically.
 * <p/>
 * Create the Spring "<strong>root</strong>" application context.<br/>
 * Register a {@link DispatcherServlet}  in the servlet context.<br/>
 * For both servlets, register a {@link CharacterEncodingFilter}.
 * <p/>
 */
public class PetclinicInitializer extends AbstractDispatcherServletInitializer {

    /**
     * Spring profile used to choose the persistence layer implementation.
     * <p>
     * When using Spring jpa, use: jpa
     * When using Spring Data JPA, use: spring-data-jpa
     * <p/>
     * <p>
     * You also may use the -Dspring.profiles.active=spring-data-jpa VM options to change
     * default jpa Spring profile.
     */
    private static final String SPRING_PROFILE = "jpa";

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        XmlWebApplicationContext rootAppContext = new XmlWebApplicationContext();
        rootAppContext.setConfigLocations("classpath:spring/business-config.xml", "classpath:spring/tools-config.xml");
        rootAppContext.getEnvironment().setDefaultProfiles(SPRING_PROFILE);
        return rootAppContext;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        XmlWebApplicationContext webAppContext = new XmlWebApplicationContext();
        webAppContext.setConfigLocation("classpath:spring/mvc-core-config.xml");
        return webAppContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        // Used to provide the ability to enter Chinese characters inside the Owner Form
        return new Filter[]{new CharacterEncodingFilter("UTF-8", true)};
    }
}
