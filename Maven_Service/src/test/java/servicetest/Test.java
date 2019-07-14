package servicetest;

import cn.itheima.dao.IproductDao;
import cn.itheima.domain.Product;
import cn.itheima.service.IproductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void findAll(){
    ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        IproductService bean = app.getBean(IproductService.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
