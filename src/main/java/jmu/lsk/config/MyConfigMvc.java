package jmu.lsk.config;

//import jmu.lsk.component.LoginIntercept;
import jmu.lsk.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfigMvc implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("adminLogin");
        registry.addViewController("/adminLogin").setViewName("adminLogin");
        registry.addViewController("/addAircraft").setViewName("addAircraft");
        registry.addViewController("/addShipping").setViewName("addShippin");
        registry.addViewController("/mainView").setViewName("mainView");
        registry.addViewController("/mainpage").setViewName("mainpage");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/login_success").setViewName("login_success");
        registry.addViewController("/insertPass").setViewName("insertPassenger");
        registry.addViewController("/search").setViewName("flights");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginIntercept()).addPathPatterns("/**").excludePathPatterns("/","/adminLogin*","/loginJudge","/static/**","/mainpage","/register");
//    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
