package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Created by Владислав on 22.05.2017.
 */
@Configuration
@EnableWs
@ComponentScan("com.shop")
public class SoapConfig  extends WsConfigurerAdapter
{
    @Bean(name = "products")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema pharmacySchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ProductPort");
        wsdl11Definition.setLocationUri("/setproduct");
        wsdl11Definition.setTargetNamespace("http://vlad.com/product");
        wsdl11Definition.setSchema(pharmacySchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema pharmacySchema() {
        return new SimpleXsdSchema(new ClassPathResource("products.xsd"));
    }
}