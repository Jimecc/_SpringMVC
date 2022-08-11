package com.stguigu.springMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Jim
 * @Description
 * @createTime 2022年08月11日
 */
public class config extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    // 获取根配置 也就是Spring的配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // 设置SpringMVC的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    // 获取DispatchServlet的路径
    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
