package com.getbookmarks.config;

import com.getbookmarks.controller.StoryResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 * Created by amarendra on 01/03/16.
 */

@EnableWebMvc
@ComponentScan(basePackageClasses = StoryResource.class)
@Configuration
public class WebMvcConfig{

}
