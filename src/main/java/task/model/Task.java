package task.model;

import location.model.Location;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private static int counter = 1;
    private int id;
    private String title;
    private String description;
    private String summary;
    private Status status;
    private boolean done;
    private LocalDate createDate;
    private LocalDate dueDate;
    private List<Skill> requiredSkills;
    private Priority priority;
    private Location location;
    private String createUserExternalId;
    private String assignedUserExternalId;

    public Task(String title, String description, String summary, Status status, boolean done, LocalDate createDate, LocalDate dueDate, List<Skill> requiredSkills, Priority priority, Location location, String createUserExternalId, String assignedUserExternalId) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.summary = summary;
        this.status = status;
        this.done = done;
        this.createDate = createDate;
        this.dueDate = dueDate;
        this.requiredSkills = requiredSkills;
        this.priority = priority;
        this.location = location;
        this.createUserExternalId = createUserExternalId;
        this.assignedUserExternalId = assignedUserExternalId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<Skill> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<Skill> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getCreateUserExternalId() {
        return createUserExternalId;
    }

    public void setCreateUserExternalId(String createUserExternalId) {
        this.createUserExternalId = createUserExternalId;
    }

    public String getAssignedUserExternalId() {
        return assignedUserExternalId;
    }

    public void setAssignedUserExternalId(String assignedUserExternalId) {
        this.assignedUserExternalId = assignedUserExternalId;
    }
}
