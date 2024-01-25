package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class ProductServicelmpl implements ProductService{

    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
