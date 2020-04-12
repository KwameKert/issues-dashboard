package com.codeinsyt.issuesdashboard.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author KwameKert
 * created on 01/04/2020
 **/

@Entity
public class GithubProject  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orgName;

    @Column(unique = true)
    private String repoName;

    public GithubProject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }


    @Override
    public String toString() {
        return "GithubProject{" +
                "id=" + id +
                ", orgName='" + orgName + '\'' +
                ", repoName='" + repoName + '\'' +
                '}';
    }
}
