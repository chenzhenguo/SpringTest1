package cn.czg.spring1;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2020/9/5.
 */
public class Main {
    public static void main(String[] args) {
        //通过spring 创建对象并di注入参数
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
     //   System.out.printf(user.toString());
        //不需要实现toString 方法打印
        System.out.print(ToStringBuilder.reflectionToString(user));

    }
}
