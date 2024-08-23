package com.example.ProductService.services;

import com.example.ProductService.dtos.FakeStoreProductDto;
import com.example.ProductService.models.Product;
import org.springframework.web.client.RestTemplate;

public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(int id) {
        /* take the id from input and
        call this endpoint
        'https://fakestoreapi.com/products/ + id

         */
        String url = "https://fakestoreapi.com/products/"+id;
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto =
                restTemplate.getForObject(url, FakeStoreProductDto.class);
        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);

    }
    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto dto){
        Product product = new Product();
        product.setCategory(dto.getCategory());
        product.setName(dto.getTitle());
        product.setDescription(dto.getDescription());
        return product;
    }
}
