package com.bharath.news;

import com.bharath.news.model.Model;
import java.util.ArrayList;

public class MainNews {
    private ArrayList<Model> articles;

    public MainNews(ArrayList<Model> articles) {
        this.articles = articles;
    }

    public ArrayList<Model> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Model> articles) {
        this.articles = articles;
    }
}
