package dev.newdate.users.service;

import dev.newdate.users.model.UserProfile;

public interface UserProfileService {
    UserProfile createUserProfile(String username, UserProfile userProfile);
    UserProfile getUserProfile(String username);
}
