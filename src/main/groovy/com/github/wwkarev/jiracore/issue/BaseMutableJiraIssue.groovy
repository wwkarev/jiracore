//package com.github.wwkarev.jiracore.issue
//
//import com.atlassian.jira.bc.issue.IssueService
//import com.atlassian.jira.component.ComponentAccessor
//import com.atlassian.jira.event.type.EventDispatchOption
//import com.atlassian.jira.issue.AttachmentManager
//import com.atlassian.jira.issue.CustomFieldManager
//import com.atlassian.jira.issue.IssueManager
//import com.atlassian.jira.issue.MutableIssue
//import com.atlassian.jira.issue.comments.CommentManager
//import com.atlassian.jira.issue.link.IssueLinkManager
//import com.atlassian.jira.user.ApplicationUser
//
///**
// * Atlassian Jira wrapper providing simplified api to  issue functionality
// * @author wwkarev
// */
//trait BaseMutableJiraIssue {
//    abstract MutableIssue getMuttableIssue()
//
//    void updateSummary(String summary, ApplicationUser user,
//                       EventDispatchOption eventDispatchOption = EventDispatchOption.DO_NOT_DISPATCH) {
//        muttableIssue.setSummary(summary)
//        ComponentAccessor.getIssueManager().updateIssue(user, muttableIssue, eventDispatchOption, false)
//    }
//
//    void updateReporter() {
//
//    }
//
//    void updateAssignee() {
//
//    }
//
//    void updateDescription() {
//
//    }
//
//    void updateResolution() {
//
//    }
//
//    private IssueManager getIssueManager() {
//        return ComponentAccessor.getIssueManager()
//    }
//
//    private IssueService getIssueService() {
//        return ComponentAccessor.getIssueService()
//    }
//
//    private CustomFieldManager getCustomFieldManager() {
//        return ComponentAccessor.getCustomFieldManager()
//    }
//
//    private IssueLinkManager getIssueLinkManager() {
//        return ComponentAccessor.getIssueLinkManager()
//    }
//
//    private AttachmentManager getAttachmentManager() {
//        return ComponentAccessor.getAttachmentManager()
//    }
//
//    private CommentManager getCommentManager() {
//        return ComponentAccessor.getCommentManager()
//    }
//}
