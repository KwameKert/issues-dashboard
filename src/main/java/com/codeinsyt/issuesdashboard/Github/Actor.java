package com.codeinsyt.issuesdashboard.Github;

public class Actor {

    private String htmlUrl;

    private String avatarUrl;

    private String login;

    public Actor(String htmlUrl, String avatarUrl, String login) {
        this.htmlUrl = htmlUrl;
        this.avatarUrl = avatarUrl;
        this.login = login;
    }


    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
