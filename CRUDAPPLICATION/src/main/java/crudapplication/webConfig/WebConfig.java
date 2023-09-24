package crudapplication.webConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("crudapplication")
public class WebConfig implements WebMvcConfigurer {

   @Bean
   public InternalResourceViewResolver internalResourceViewResolver() {
	   InternalResourceViewResolver internalResourceViewResolver= new InternalResourceViewResolver();
	   internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	   internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
	   
   
    }
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
   }

}
