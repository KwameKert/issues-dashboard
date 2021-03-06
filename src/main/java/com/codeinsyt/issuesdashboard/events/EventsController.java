package com.codeinsyt.issuesdashboard.events;


import com.codeinsyt.issuesdashboard.Github.GithubClient;
import com.codeinsyt.issuesdashboard.Github.RepositoryEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class EventsController {

    private final GithubProjectRepository githubProjectRepository;

    private final GithubClient githubClient;

    public EventsController(GithubProjectRepository githubProjectRepository, GithubClient githubClient) {
        this.githubProjectRepository = githubProjectRepository;
        this.githubClient = githubClient;
    }

    @GetMapping("/events/{repoName}")
    @ResponseBody
    public RepositoryEvent[] fetchEvents(@PathVariable String repoName){

        GithubProject githubProject = this.githubProjectRepository.findByRepoName(repoName);
        return this.githubClient.fetchRepositoryEvents(githubProject.getOrgName(),githubProject.getRepoName()).getBody();
    }



}
