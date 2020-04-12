package com.codeinsyt.issuesdashboard.Github;

public class Issue {

    private final String htmlUrl;

    private final int number;

    private final String title;


    public Issue(String htmlUrl, int number, String title) {
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.title = title;
    }


    public String getHtmlUrl() {
        return htmlUrl;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}
