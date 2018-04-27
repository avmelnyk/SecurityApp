package ua.pp.avmelnyk.securityapp.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppConf extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected String[] getServletMappings() {
        return new String[]
                { "/"};
    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }


}   
