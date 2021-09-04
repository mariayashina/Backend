package service;

import retrofit2.Call;
import retrofit2.http.*;
import HomeWork_5.dto.Product;

import java.util.ArrayList;

public interface ProductService {
    @GET("products")
    Call<ArrayList<Product>> getProducts();

    @POST("products")
    Call<Product> createProduct(@Body Product product);

    @PUT("products")
    Call<Product> putProduct(@Body Product product);

    @GET("products/{id}")
    Call<Product> getProduct(@Path("id") Integer id);

    @DELETE("products/{id}")
    Call<Product> deleteProduct(@Path("id") Integer id);
}
