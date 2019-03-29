package irlinteract.maincode;

import java.util.ArrayList;

public class WeatherJson {
    private String description;

    public WeatherJson(String description) {
        this.description = description;
    }

    public class Codebeautify {
        private String $id;
        Buienradar BuienradarObject;
        Actual ActualObject;
        Forecast ForecastObject;


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public Buienradar getBuienradar() {
            return BuienradarObject;
        }

        public Actual getActual() {
            return ActualObject;
        }

        public Forecast getForecast() {
            return ForecastObject;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setBuienradar(Buienradar buienradarObject) {
            this.BuienradarObject = buienradarObject;
        }

        public void setActual(Actual actualObject) {
            this.ActualObject = actualObject;
        }

        public void setForecast(Forecast forecastObject) {
            this.ForecastObject = forecastObject;
        }
    }

    public class Forecast {
        private String $id;
        Weatherreport WeatherreportObject;
        Shortterm ShorttermObject;
        Longterm LongtermObject;
        ArrayList<Object> fivedayforecast = new ArrayList<Object>();


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public Weatherreport getWeatherreport() {
            return WeatherreportObject;
        }

        public Shortterm getShortterm() {
            return ShorttermObject;
        }

        public Longterm getLongterm() {
            return LongtermObject;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setWeatherreport(Weatherreport weatherreportObject) {
            this.WeatherreportObject = weatherreportObject;
        }

        public void setShortterm(Shortterm shorttermObject) {
            this.ShorttermObject = shorttermObject;
        }

        public void setLongterm(Longterm longtermObject) {
            this.LongtermObject = longtermObject;
        }
    }

    public class Longterm {
        private String $id;
        private String startdate;
        private String enddate;
        private String forecast;


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public String getStartdate() {
            return startdate;
        }

        public String getEnddate() {
            return enddate;
        }

        public String getForecast() {
            return forecast;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public void setForecast(String forecast) {
            this.forecast = forecast;
        }
    }

    public class Shortterm {
        private String $id;
        private String startdate;
        private String enddate;
        private String forecast;


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public String getStartdate() {
            return startdate;
        }

        public String getEnddate() {
            return enddate;
        }

        public String getForecast() {
            return forecast;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public void setForecast(String forecast) {
            this.forecast = forecast;
        }
    }

    public class Weatherreport {
        private String $id;
        private String published;
        private String title;
        private String summary;
        private String text;
        private String author;
        private String authorbio;


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public String getPublished() {
            return published;
        }

        public String getTitle() {
            return title;
        }

        public String getSummary() {
            return summary;
        }

        public String getText() {
            return text;
        }

        public String getAuthor() {
            return author;
        }

        public String getAuthorbio() {
            return authorbio;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setPublished(String published) {
            this.published = published;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setAuthorbio(String authorbio) {
            this.authorbio = authorbio;
        }
    }

    public class Actual {
        private String $id;
        private String actualradarurl;
        private String sunrise;
        private String sunset;
        ArrayList<Object> stationmeasurements = new ArrayList<Object>();


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public String getActualradarurl() {
            return actualradarurl;
        }

        public String getSunrise() {
            return sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setActualradarurl(String actualradarurl) {
            this.actualradarurl = actualradarurl;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }
    }

    public class Buienradar {
        private String $id;
        private String copyright;
        private String terms;


        // Getter Methods

        public String get$id() {
            return $id;
        }

        public String getCopyright() {
            return copyright;
        }

        public String getTerms() {
            return terms;
        }

        // Setter Methods

        public void set$id(String $id) {
            this.$id = $id;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public void setTerms(String terms) {
            this.terms = terms;
        }
    }
}

