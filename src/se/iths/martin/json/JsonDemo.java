package se.iths.martin.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


class Albums {
    ArrayList<Album> albums = new ArrayList<>();
}

public class JsonDemo {

    public static GsonBuilder builder = new GsonBuilder();

    public static void main(String[] args) {

        Album album = new Album();
        album.title = "Sköna sånger";
        album.artist = "Blandbandet";
        album.tracks = 2;
        album.highQuality = true;
        album.length = 23.1f;

//        ArrayList<Album> albums = new ArrayList<>();
//        albums.add(album);
//        albums.add(album);

        Albums albums = new Albums();
        albums.albums.add(album);
        albums.albums.add(album);
        //Object -> Json
        Gson gson = builder.create();
        String jsonString =gson.toJson(albums);
        System.out.println(jsonString);


        //Json -> Object
        //Första typen i json datan är objekt
        Albums albumFromJson = gson.fromJson(jsonString, Albums.class);
        System.out.println(albumFromJson.albums.get(0).title);

        //Om yttertypen i json data är lista []
//        Type listType = new TypeToken<ArrayList<Album>>(){}.getType();
//        ArrayList<Album> albumsFromJson = gson.fromJson(jsonString, listType);

        //System.out.println(albumsFromJson.get(0).title);
    }



}
