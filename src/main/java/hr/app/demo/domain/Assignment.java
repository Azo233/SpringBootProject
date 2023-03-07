package hr.app.demo.domain;

import jakarta.persistence.*;

@Entity
public class Assignment {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String gitHubUrl;
    private String branch;
    private String codeReviewvideoUrl;

    @ManyToOne(optional = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
// TODO -> private User assignedTo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCodeReviewvideoUrl() {
        return codeReviewvideoUrl;
    }

    public void setCodeReviewvideoUrl(String codeReviewvideoUrl) {
        this.codeReviewvideoUrl = codeReviewvideoUrl;
    }
}

