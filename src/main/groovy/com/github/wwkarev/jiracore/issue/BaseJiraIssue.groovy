package com.github.wwkarev.jiracore.issue

import com.atlassian.jira.issue.Issue
import com.atlassian.jira.issue.issuetype.IssueType
import com.atlassian.jira.issue.status.Status
import com.atlassian.jira.project.Project
import com.atlassian.jira.user.ApplicationUser
import groovy.transform.PackageScope

/**
 * Atlassian Jira wrapper providing simplified api to  issue functionality
 * @author wwkarev
 */
@PackageScope
trait BaseJiraIssue {
    abstract Issue getIssue()

    Long getId() {
        return issue.getId()
    }
    Long getKey() {
        return issue.getKey()
    }

    String getSummary() {
        return issue.getSummary()
    }

    ApplicationUser getReporter() {
        return issue.getReporter()
    }

    ApplicationUser getAssignee() {
        return issue.getAssignee()
    }

    IssueType getIssueType() {
        return issue.getIssueType()
    }
    String getIssueTypeId() {
        return issue.getIssueTypeId()
    }

    Project getProject() {
        return issue.getProjectObject()
    }
    Long getProjectId() {
        return issue.getProjectId()
    }

    Status getStatus() {
        return issue.getStatus()
    }
    String getStatusId() {
        return issue.getStatusId()
    }
}
