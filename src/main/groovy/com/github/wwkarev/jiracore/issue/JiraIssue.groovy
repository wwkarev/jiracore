//package com.github.wwkarev.jiracore.issue
//
//import com.atlassian.jira.bc.ValidationErrorsException
//import com.atlassian.jira.bc.issue.IssueService
//import com.atlassian.jira.component.ComponentAccessor
//import com.atlassian.jira.issue.AttachmentManager
//import com.atlassian.jira.issue.CustomFieldManager
//import com.atlassian.jira.issue.Issue
//import com.atlassian.jira.issue.IssueManager
//import com.atlassian.jira.issue.attachment.Attachment
//import com.atlassian.jira.issue.comments.Comment
//import com.atlassian.jira.issue.comments.CommentManager
//import com.atlassian.jira.issue.index.IssueIndexingService
//import com.atlassian.jira.issue.link.IssueLink
//import com.atlassian.jira.issue.link.IssueLinkManager
//import com.atlassian.jira.user.ApplicationUser
//import com.atlassian.jira.util.ImportUtils
//
///**
// * Atlassian Jira wrapper providing simplified api to  issue functionality
// * @author wwkarev
// */
//trait JiraIssue implements BaseJiraIssue {
//    def getValue(Long customFieldId) {
//        def customField = customFieldManager.getCustomFieldObject(customFieldId)
//        return issue.getCustomFieldValue(customField)
//    }
//
//    List<Issue> getInwardLinkedIssues(Long linkType) {
//        List<Issue> issueList = []
//        issueLinkManager.getInwardLinks(issue.getId()).each{IssueLink issueLink ->
//            if (issueLink.getLinkTypeId() == linkType && issueLink.getSourceObject() != null) {
//                issueList.add(issueLink.getSourceObject())
//            }
//        }
//        return issueList
//    }
//
//    List<Issue> getOutwardLinkedIssues(Long linkType) {
//        List<Issue> issueList = []
//        issueLinkManager.getOutwardLinks(issue.getId()).each{IssueLink issueLink ->
//            if (issueLink.getLinkTypeId() == linkType && issueLink.getDestinationObject() != null) {
//                issueList.add(issueLink.getDestinationObject())
//            }
//        }
//        return issueList
//    }
//
//    List<Attachment> getAttachments() {
//        attachmentManager.getAttachments(issue)
//    }
//
//    List<Comment> getComments() {
//        return commentManager.getComments(issue)
//    }
//
//    void reindex() {
//        IssueIndexingService issueIndexingService = ComponentAccessor.getComponent(IssueIndexingService)
//        boolean wasIndexing = ImportUtils.isIndexIssues()
//        ImportUtils.setIndexIssues(true)
//        issueIndexingService.reIndex(issueManager.getIssueObject(issue.getId()))
//        ImportUtils.setIndexIssues(wasIndexing)
//    }
//
//    void delete(ApplicationUser user) {
//        IssueService.DeleteValidationResult validationResult = issueService.validateDelete(user, issue.getId())
//        if (validationResult.errorCollection.hasAnyErrors()) {
//            throw new ValidationErrorsException("Can't delete issue $issue ${issue.getId()}, ${validationResult.errorCollection.errorMessages}")
//        }
//        else {
//            issueService.delete(user, validationResult)
//        }
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
