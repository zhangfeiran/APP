package com.bignewsmaker.makebignews.basic_class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class News implements Serializable {
    protected String lang_Type = null;
    protected String newsClassTag = null;
    protected String news_Author = null;
    protected String news_ID = null;
    protected String news_Pictures = null;
    protected String news_Source = null;
    protected String news_Time = null;
    protected String news_Title = null;
    protected String news_URL = null;
    protected String news_Video = null;
    protected String news_Intro = null;
    protected String news_Content = null;
    protected boolean isRead = false;
    protected List<Item1> Keywords = new ArrayList<>();

    public String getNews_Content() {
        return news_Content;
    }

    public void setNews_Content(String news_Content) {
        this.news_Content = news_Content;
    }



    public List<Item1> getKeywords() {
        return Keywords;
    }

    public void setKeywords(List<Item1> keywords) {
        Keywords = keywords;
    }

    public ArrayList<Item2> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Item2> persons) {
        this.persons = persons;
    }

    protected ArrayList<Item2> persons= new ArrayList<>();

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getLang_Type() {
        return lang_Type;
    }

    public void setLang_Type(String lang_Type) {
        this.lang_Type = lang_Type;
    }

    public String getNewsClassTag() {
        return newsClassTag;
    }

    public void setNewsClassTag(String newsClassTag) {
        this.newsClassTag = newsClassTag;
    }

    public String getNews_Author() {
        return news_Author;
    }

    public void setNews_Author(String news_Author) {
        this.news_Author = news_Author;
    }

    public String getNews_ID() {
        return news_ID;
    }

    public void setNews_ID(String news_ID) {
        this.news_ID = news_ID;
    }

    public String getNews_Pictures() {
        return news_Pictures;
    }

    public void setNews_Pictures(String news_Pictures) {
        this.news_Pictures = news_Pictures;
    }

    public String getNews_Source() {
        return news_Source;
    }

    public void setNews_Source(String news_Source) {
        this.news_Source = news_Source;
    }

    public String getNews_Time() {
        return news_Time;
    }

    public void setNews_Time(String news_Time) {
        this.news_Time = news_Time;
    }

    public String getNews_Title() {
        return news_Title;
    }

    public void setNews_Title(String news_Title) {
        this.news_Title = news_Title;
    }

    public String getNews_URL() {
        return news_URL;
    }

    public void setNews_URL(String news_URL) {
        this.news_URL = news_URL;
    }

    public String getNews_Video() {
        return news_Video;
    }

    public void setNews_Video(String news_Video) {
        this.news_Video = news_Video;
    }

    public String getNews_Intro() {
        return news_Intro;
    }

    public void setNews_Intro(String news_Intro) {
        this.news_Intro = news_Intro;
    }
}