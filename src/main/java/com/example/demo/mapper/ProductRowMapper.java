package com.example.demo.mapper;

import com.example.demo.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setOwnerId(resultSet.getInt("owner_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setProductPrice(resultSet.getInt("product_price"));
        product.setProductAmount(resultSet.getInt("product_amount"));
        product.setOwnerPreSite(resultSet.getString("owner_pre_site"));
        product.setCountrySite(resultSet.getString("county_site"));
        product.setProductIntro(resultSet.getString("product_intro"));
        product.setUploadTime(resultSet.getDate("upload_time"));
        return product;
    }
}