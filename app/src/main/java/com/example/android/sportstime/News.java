/*
 * Copyright (c) 2017 by Francis Gálvez
 */
package com.example.android.sportstime;

class News {

    /** The title of the news */
    private String headline;

    /** News type (e.g. sports, lifestyle...) */
    private String section;

    /** Date of publishment */
    private String date;

    /** URL of this news */
    private String url;

    News(String headline, String section, String date, String url){
        this.headline = headline;
        this.section = section;
        this.date = date;
        this.url = url;
    }

    String getHeadline() {
        return headline;
    }

    String getSection() {
        return section;
    }

    String getDate() {
        return date;
    }

    String getUrl() {
        return url;
    }
}
