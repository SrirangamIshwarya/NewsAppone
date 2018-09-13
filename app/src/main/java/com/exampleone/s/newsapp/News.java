package com.exampleone.s.newsapp;

public class News {
    private String title;
    private String author;
    private String webUrl;
    private String section;
    private String date;
    public News(String section,String date,String title, String author, String webUrl) {
        this.section=section;
        this.date=date;
        this.title = title;
        this.author = author;
        this.webUrl = webUrl;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getWebUrl() {
        return webUrl;
    }
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }
}