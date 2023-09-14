package lk.ijse.spring;

import lk.ijse.spring.Config.AppConfig;
import lk.ijse.spring.pojo.ImanPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cts=new AnnotationConfigApplicationContext();
        cts.register(AppConfig.class);
        cts.refresh();

        ImanPojo iman1 = cts.getBean(ImanPojo.class);
        ImanPojo iman2 = cts.getBean(ImanPojo.class);
        System.out.println(iman1);
        System.out.println(iman2);


        iman1.ImanDancing();

    }


}
