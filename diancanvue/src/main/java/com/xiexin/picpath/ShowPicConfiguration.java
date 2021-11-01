package com.xiexin.picpath;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class ShowPicConfiguration implements WebMvcConfigurer {

    /**
     * 虚拟路径配置
     * @param registry
     *
     * /Document/**: 相当于 别名的意思
     * file:/D:/test/: 本地文件的路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/Document/**").addResourceLocations("file:/D:/test/");
        registry.addResourceHandler("/imgfile/**").addResourceLocations("file:/D:/xunipic/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
        // 127.0，0，1：端口/imgfile/图片名字。jpg
    }
}
