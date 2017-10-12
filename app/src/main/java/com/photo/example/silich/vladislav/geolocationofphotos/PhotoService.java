package com.photo.example.silich.vladislav.geolocationofphotos;


import com.photo.example.silich.vladislav.geolocationofphotos.model.req.ModelImageReq;
import com.photo.example.silich.vladislav.geolocationofphotos.model.req.ModelSignUpInReq;
import com.photo.example.silich.vladislav.geolocationofphotos.model.res.ModelGetPhotoRes;
import com.photo.example.silich.vladislav.geolocationofphotos.model.res.ModelImageRes;
import com.photo.example.silich.vladislav.geolocationofphotos.model.res.ModelSignUpInRes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;



/**
 * Created by Lenovo on 11.09.2017.
 */

public interface PhotoService {
    @POST("account/signup")
    Call<ModelSignUpInRes> signUp (@Body ModelSignUpInReq reqSignUp);

    @POST("account/signin")
    Call<ModelSignUpInRes> signIn (@Body ModelSignUpInReq reqSignIn);

    @POST("image")
    Call<ModelImageRes> sendImage(@Header("Access-Token") String token, @Body ModelImageReq modelImageReq);

    @GET("image")
    Call<ModelGetPhotoRes> getImage(@Query("page") int page, @Header("Access-Token") String token);
}
