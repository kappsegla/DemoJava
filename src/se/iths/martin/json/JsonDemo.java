package se.iths.martin.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonDemo {

    public static GsonBuilder builder = new GsonBuilder();

    public static void main(String[] args) {

        Album album = new Album();
        album.title = "Sköna sånger";
        album.artist = "Blandbandet";
        album.tracks = 2;
        album.highQuality = true;
        album.length = 23.1f;

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album);
        albums.add(album);

        Gson gson = builder.create();
        String jsonString =gson.toJson(albums);
        System.out.println(jsonString);

        //Album albumFromJson = gson.fromJson(jsonString, Album.class);
        //System.out.println(albumFromJson.title);

        Type listType = new TypeToken<ArrayList<Album>>(){}.getType();
        ArrayList<Album> albumsFromJson = gson.fromJson(jsonString, listType);

        System.out.println(albumsFromJson.get(0).title);
    }



}
