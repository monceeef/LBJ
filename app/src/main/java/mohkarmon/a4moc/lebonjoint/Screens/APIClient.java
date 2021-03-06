package mohkarmon.a4moc.lebonjoint.Screens;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIClient {

   private static Retrofit retrofit = null;
   public static final String BASE_URL = "http://10.0.2.2:3000/api/";

   public static Retrofit getClient() {

       HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
       interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
       OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


       retrofit = new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .client(client)
               .build();



       return retrofit;
   }

}
