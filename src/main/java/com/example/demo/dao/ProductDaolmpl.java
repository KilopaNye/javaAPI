package com.example.demo.dao;

import com.example.demo.model.Product;
import com.example.demo.mapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaolmpl implements ProductDao{

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<Product> getAll() {
        String sql = "SELECT m.id, owner_id, product_name, product_price, product_amount, owner_pre_site, county_site, product_intro, upload_time FROM product_info m";

        Map<String, Object> map = new HashMap<>();

        List<Product> list = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        return list;
    }
}
