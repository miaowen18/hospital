package com.itgaoshu.hospital.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    /**
     * ShiroFilterFactoryBean
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager);
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<>();
        //toLogin/login界面可以未认证直接访问
        filterChainDefinitionMap.put("/sel/login", "anon");
        filterChainDefinitionMap.put("index.html", "anon");
        //静态资源直接访问
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/layui/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("*.png", "anon");
        filterChainDefinitionMap.put("*jpg", "anon");
        //未认证都不允许通过
        filterChainDefinitionMap.put("/**", "authc");
        bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        bean.setLoginUrl("sel/toLogin");
        return bean;
    }

    /**
     * securityManager
     * @param userRealm
     * @return
     */
    @Bean("securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    /**
     * Realm
     * @return
     */
    @Bean("userRealm")
    public UserRealm userRealm(){
        return new UserRealm();
    }

    /**
     * shiroDialect
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
}