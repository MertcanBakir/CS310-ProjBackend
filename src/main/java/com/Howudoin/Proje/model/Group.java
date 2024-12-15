package com.Howudoin.Proje.model;

import java.time.LocalDateTime; // Represents a date-time without a time zone in the ISO-8601 format.
import java.util.ArrayList; // Provides a resizable array implementation.
import java.util.Date; // Represents date and time.
import java.util.List; // Represents a collection of elements.
import lombok.Getter; // Automatically generates getter methods.
import lombok.Setter; // Automatically generates setter methods.
import org.springframework.data.annotation.Id; // Marks the field as the unique identifier in the MongoDB collection.
import org.springframework.data.mongodb.core.mapping.Document; // Specifies that this class is a MongoDB document.
import lombok.Data; // Generates getters, setters, equals, hashCode, toString methods, and a constructor.

@Setter // Automatically generates setter methods.
@Getter // Automatically generates getter methods.
@Data // Combines @Getter, @Setter, and other annotations to create useful methods like equals(), hashCode(), toString(), and constructor.
@Document(collection = "groups") // Marks this class as a MongoDB document for the "groups" collection.
public class Group {

    @Id
    private String id; // The unique identifier for the group.
    private String name; // The name of the group.
    private List<String> members = new ArrayList<>(); // List of members' IDs (represented as strings).

    private Date creationTime; // The time when the group was created.

    // Custom setter and getter methods are generated by @Setter and @Getter, but shown here for clarity.
    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    // Adds a member's ID to the group's member list.
    public void addMember(String memberId) {
        this.members.add(memberId);
    }
}