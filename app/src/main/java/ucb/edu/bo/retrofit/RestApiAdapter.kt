package ucb.edu.bo.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestApiAdapter {
    fun connexionApi(): EndPointApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(ConstantsRestApi.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(EndPointApi::class.java)
    }

}