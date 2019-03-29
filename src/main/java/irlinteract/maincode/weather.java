//package irlinteract.maincode;
//
//import org.json.simple.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.lang.String;
////import org.json.JSONObject;
//
//public class weather {
//    public static void main(String[] args) {
//        try {
//            String url = "https://data.buienradar.nl/2.0/feed/json";
//            URL obj = new URL(url);
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("GET");
//            con.setRequestProperty("User-Agent", "Mozilla/5.0");
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//            System.out.println(response.toString());
////            JSONObject obj_JSONObject = new JSONObject(response.toString());
//            JSONObject obj_JSONObject = new JSONObject(InputStreamReader(InputStream()));
//
//            System.out.println("result after Reading JSON Response");
//            System.out.println("statusCode- " + obj_JSONObject.get("statusCode"));
//            System.out.println("statusMessage- " + obj_JSONObject.get("statusMessage"));
//            System.out.println("ipAddress- " + obj_JSONObject.get("ipAddress"));
//            System.out.println("countryCode- " + obj_JSONObject.get("countryCode"));
//            System.out.println("countryName- " + obj_JSONObject.get("countryName"));
//            System.out.println("regionName- " + obj_JSONObject.get("regionName"));
//            System.out.println("cityName- " + obj_JSONObject.get("cityName"));
//            System.out.println("zipCode- " + obj_JSONObject.get("zipCode"));
//            System.out.println("latitude- " + obj_JSONObject.get("latitude"));
//            System.out.println("longitude- " + obj_JSONObject.get("longitude"));
//            System.out.println("timeZone- " + obj_JSONObject.get("timeZone"));
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//    }
//}
