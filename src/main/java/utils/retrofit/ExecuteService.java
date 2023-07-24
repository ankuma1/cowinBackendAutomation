package utils.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ExecuteService {


    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
    private static Retrofit retrofit;
    private static OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
    private static HttpLoggingInterceptor logger = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    private static ExecuteService executeService;
    public static Logger logger1 = LoggerFactory.getLogger(APITest.class);
    public ExecuteService setUp(String url)
    {
        retrofitBuilder.baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        okHttpBuilder.addInterceptor(logger);
        retrofitBuilder=retrofitBuilder.client(okHttpBuilder.build());
        retrofit = retrofitBuilder.build();
        if(executeService==null)
        {
            executeService = new ExecuteService();
        }
        return executeService;
    }
    public <S> S services(Class<S> service)
    {
        return retrofit.create(service);
    }

}
