package cn.itheima.service.Impl;

import cn.itheima.dao.IproductDao;
import cn.itheima.domain.Product;
import cn.itheima.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("productService")
public class IproductServiceImpl implements IproductService {
    @Autowired
    private IproductDao dao;

    public List<Product> findAll() {
        return dao.findAll();
    }
}
