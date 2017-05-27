package com.shop;

import com.shop.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";
    private final static String SOAPSERVLET = "SoapServlet";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));

        MessageDispatcherServlet soapServlet = new MessageDispatcherServlet();
        soapServlet.setApplicationContext(ctx);
        soapServlet.setTransformWsdlLocations(true);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER,new DispatcherServlet(ctx));
        ServletRegistration.Dynamic soapsrvlt = servletContext.addServlet(SOAPSERVLET,soapServlet);
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        soapsrvlt.addMapping("/setproduct/*");
        soapsrvlt.setLoadOnStartup(2);
    }
}