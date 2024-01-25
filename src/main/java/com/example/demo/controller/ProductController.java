package com.example.demo.controller;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@ControllerAdvice
public class ProductController {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private ProductService productService;
    @Operation(summary = "Get All Product Info")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Product",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found",
                    content = @Content) })
    @GetMapping("/product")
    public List<Product> product(){
        return productService.getAll();
    }
}