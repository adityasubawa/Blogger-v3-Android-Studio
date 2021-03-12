package com.teknologi.api;

/*
 * Created by Aditya Subawa
 * Product: Teknologi Informasi based on Blogger API v3
 * 13 Okt 2020, Denpasar, Bali - Indonesia
 */

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Api
{
    public static final String key = "AIzaSyC8ZdXCGK5KsTPrxr6SIGoPcgTAfAcspdM";
    public static final String blog_id="5628972843210972748";
    private static final String url = "https://www.googleapis.com/blogger/v3/blogs/"+blog_id+"/posts/";
   
    public static PostService postService = null;

    public static PostService getService()
    {
        if (postService == null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService {
        @GET("?key=" + key)
        Call<PostList> getPostList();
    }

}
