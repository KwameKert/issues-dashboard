package com.codeinsyt.issuesdashboard.Github;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GithubClient {

    private final String EVENTS_ISSUES_URL = "https://api.github.com/repos/{owner}/{repo}/issues/events";


    private RestTemplate restTemplate;

    public GithubClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    ResponseEntity<RepositoryEvent[]> fetchRepositoryEvents(String orgName, String repoName){
       return this.restTemplate.getForEntity(EVENTS_ISSUES_URL,RepositoryEvent[].class,orgName,repoName);
    }
}
