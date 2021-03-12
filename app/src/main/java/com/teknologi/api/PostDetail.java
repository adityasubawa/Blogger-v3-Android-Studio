package com.teknologi.api;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostDetail {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("blog")
    @Expose
    private Blog blog;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("title")
    @Expose
    private static String title;
    @SerializedName("content")
    @Expose
    private static String content;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("replies")
    @Expose
    private Replies replies;
    @SerializedName("labels")
    @Expose
    private List<String> labels = new ArrayList<String>();
    @SerializedName("etag")
    @Expose
    private String etag;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Replies getReplies() {
        return replies;
    }

    public void setReplies(Replies replies) {
        this.replies = replies;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

}
