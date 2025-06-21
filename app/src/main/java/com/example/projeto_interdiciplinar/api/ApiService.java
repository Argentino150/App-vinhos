package com.example.projeto_interdiciplinar.api;
import com.example.projeto_interdiciplinar.model.LoginRequest;
import com.example.projeto_interdiciplinar.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface ApiService {
    @POST("auth/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}