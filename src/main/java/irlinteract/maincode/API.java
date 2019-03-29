///*
// * Copyright (c) 2019.
// * Ruben Flinterman
// */
//
//package irlinteract.maincode;
//
//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.async.Callback;
//import com.mashape.unirest.http.exceptions.UnirestException;
//import org.bukkit.plugin.java.JavaPlugin;
//
//public class API extends JavaPlugin {
//    @Override
//    public void onEnable() {
//getServer().broadcastMessage("Test!");
//        getServer().getScheduler().runTaskTimer(this, () -> {
//            Unirest.get("https://www.data.buienradar.nl/2.0/feed/json").asJsonAsync(new Callback<JsonNode>() {
//                @Override
//                public void completed(HttpResponse<JsonNode> response) {
//                    getServer().broadcastMessage(response.getBody().toString());
//                    getLogger().info(response.getBody().toString());
//                }
//
//                @Override
//                public void failed(UnirestException e) {
//                    e.printStackTrace();
//                }
//
//                @Override
//                public void cancelled() {
//
//                }
//            });
//        }, 0, 20 * 30);
//    }
//
//    @Override
//    public void onDisable() {
//
//    }
//}
//
////import com.google.gson.Gson;
////import com.google.gson.GsonBuilder;
////import com.google.gson.JsonParser;
////import com.google.gson.stream.JsonReader;
////import com.google.gson.stream.JsonToken;
////import org.json.simple.JSONObject;
////
////import java.io.*;
////import java.net.HttpURLConnection;
////import java.net.MalformedURLException;
////import java.net.URL;
//
//
////public class API {
////    private URL json;
////    public API(){
////        try {
////            json = new URL("https://data.buienradar.nl/2.0/feed/json");
////        } catch (MalformedURLException e) {
////            e.printStackTrace();
////        }r(json.toString()));
////    }
////
////    public static void main(String[] args){
////        new API();
////    }
////}
//
////public class API {
////    public static void main(String[] args) {
////        try{
////            URL getJson = new URL("https://data.buienradar.nl/2.0/feed/json");
////
////            Gson gson = new Gson();
////            WeatherJson getWeather = gson.fromJson(String.valueOf(getJson), WeatherJson.class);
////        }catch (IOException ex){
////            ex.printStackTrace();
////        }
////
////    }
////}
//
////public class API {
////    //public static Object weather;
////
////    public static void main(String[] args) {
//////        try {
//////            URL getJson = new URL("https://data.buienradar.nl/2.0/feed/json");
////////            String getJson = "https://data.buienradar.nl/2.0/feed/json";
//////            JsonReader jsonReader = new JsonReader(new StringReader(getJson));
//////
//////            while (jsonReader.hasNext()) {
//////                JsonToken nextToken = jsonReader.peek();
//////                System.out.println(nextToken);
//////
//////                if (JsonToken.BEGIN_OBJECT.equals(nextToken)) {
//////                    jsonReader.beginObject();
//////                } else if (JsonToken.STRING.equals(nextToken)) {
//////                    String name = jsonReader.nextName();
//////                    System.out.println(name);
//////                } else if (JsonToken.STRING.equals(nextToken)) {
//////                    String value =  jsonReader.nextString();
//////                    System.out.println(value);
//////                } else if (JsonToken.NUMBER.equals(nextToken)){
//////                    long value = jsonReader.nextLong();
//////                    System.out.println(value);
//////                }
//////            }
//////
//////        } catch (MalformedURLException e) {
//////            e.printStackTrace();
//////        }
//////        System.out.println(+weather.getstring("id"));
////
////
////
////    }
////}
//
