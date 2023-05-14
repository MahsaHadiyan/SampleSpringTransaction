package com.github.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
   private static ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("spring.xml");
   public static Object getBean(String beanId)
   {
      return APPLICATION_CONTEXT.getBean(beanId);
   }
   public static void reload()
   {
      APPLICATION_CONTEXT =new ClassPathXmlApplicationContext("spring.xml");
   }
}
