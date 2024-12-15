package com.Howudoin.Proje.model;

import lombok.Data; // Generates getters, setters, equals, hashCode, and toString methods.
import lombok.Getter; // Generates getter methods for fields.
import lombok.Setter; // Generates setter methods for fields.
import org.springframework.data.annotation.Id; // Marks the field as the unique identifier in the MongoDB collection.
import org.springframework.data.mongodb.core.mapping.Document; // Specifies that this class is a MongoDB document.

import java.util.ArrayList; // Provides a resizable array implementation.
import java.util.List; // Represents a collection of elements.

@Setter // Automatically generates setter methods.
@Getter // Automatically generates getter methods.
@Data // Combines @Getter, @Setter, and other annotations to create useful methods like equals(), hashCode(), toString(), and constructor.
@Document(collection = "users") // Marks this class as a MongoDB document for the "users" collection.
public class User {
    @Id
    private String id; // The unique identifier for the user.
    private String name; // The user's first name.
    private String lastName; // The user's last name.
    private String email; // The user's email address.
    private String password; // The user's password.

    private List<String> friends = new ArrayList<>(); // List of accepted friends (friend IDs).
    private List<String> pendingFriendRequests = new ArrayList<>(); // List of pending friend requests (requester IDs).
    private List<String> groups = new ArrayList<>(); // List of groups the user is a part of (group IDs).

    // Custom setter methods are automatically generated by @Setter, but this method is explicitly shown for clarity.
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Additional function: Adds a group to the user's list of groups.
    public void addGroup(String groupName) {
        this.groups.add(groupName);
    }

    // Additional function: Directly updates the list of groups (for example, initialization).
    public void setGroups(List<String> newGroups) {
        this.groups = newGroups;
    }
}