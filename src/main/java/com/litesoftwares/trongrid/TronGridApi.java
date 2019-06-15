package com.litesoftwares.trongrid;

import com.litesoftwares.trongrid.exception.TronGridApiException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class TronGridApi {
    private final String API_URL = "https://api.trongrid.io";

    private  Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(JacksonConverterFactory.create());

    private Retrofit retrofit =  builder.build();

    public <S> S createService(Class<S> serviceClass){
        return retrofit.create(serviceClass);

    }

    public <T> T executeSync(Call<T> call){
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                try {
                    TronGridApiError apiError = getTronGridApiError(response);
                    apiError.setCode(response.code());
                    throw new TronGridApiException(apiError);
                } catch (IOException e) {
                    throw new TronGridApiException(response.toString(), e);
                }
            }
        } catch (IOException e) {
            throw new TronGridApiException(e);
        }
    }

    private TronGridApiError getTronGridApiError(Response<?> response) throws IOException {
        return (TronGridApiError) retrofit.responseBodyConverter(TronGridApiError.class, new Annotation[0])
                .convert(response.errorBody());
    }
}
