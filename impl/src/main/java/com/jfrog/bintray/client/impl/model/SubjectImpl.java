package com.jfrog.bintray.client.impl.model;

import com.jfrog.bintray.client.api.details.SubjectDetails;
import com.jfrog.bintray.client.api.model.Subject;
import org.joda.time.DateTime;

import java.util.Collection;

/**
 * @author Noam Y. Tenne
 */
public class SubjectImpl implements Subject {

    private String name;
    private String fullName;
    private String gravatarId;
    private Collection<String> repositories;
    private Collection<String> organizations;
    private Integer followersCount;
    private DateTime registered;
    private Long quotaUsedBytes;

    public SubjectImpl() {
    }

    public SubjectImpl(SubjectDetails subjectDetails) {
        this.name = subjectDetails.getName();
        this.fullName = subjectDetails.getFullName();
        this.gravatarId = subjectDetails.getGravatarId();
        this.repositories = subjectDetails.getRepos();
        this.organizations = subjectDetails.getOrganizations();
        this.followersCount = subjectDetails.getFollowersCount();
        this.registered = subjectDetails.getRegistered();
        this.quotaUsedBytes = subjectDetails.getQuotaUsedBytes();
    }

    public SubjectImpl(String name, String fullName, String gravatarId, Collection<String> repositories,
                       Collection<String> organizations, Integer followersCount, DateTime registered, Long quotaUsedBytes) {
        this.name = name;
        this.fullName = fullName;
        this.gravatarId = gravatarId;
        this.repositories = repositories;
        this.organizations = organizations;
        this.followersCount = followersCount;
        this.registered = registered;
        this.quotaUsedBytes = quotaUsedBytes;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public Collection<String> getRepositories() {
        return repositories;
    }

    public Collection<String> getOrganizations() {
        return organizations;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public DateTime getRegistered() {
        return registered;
    }

    public Long getQuotaUsedBytes() {
        return quotaUsedBytes;
    }
}
