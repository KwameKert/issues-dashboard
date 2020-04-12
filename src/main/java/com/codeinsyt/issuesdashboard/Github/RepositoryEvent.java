package com.codeinsyt.issuesdashboard.Github;

import java.time.OffsetDateTime;

public class RepositoryEvent {

     private final Type type;

     private final OffsetDateTime creationTime;

     private final Actor actor;

     private final Issue issue;


    public RepositoryEvent(Type type, OffsetDateTime creationTime, Actor actor, Issue issue) {
        this.type = type;
        this.creationTime = creationTime;
        this.actor = actor;
        this.issue = issue;
    }
}
