package dev.newdate.users.service;

import dev.newdate.users.model.User;
import dev.newdate.users.model.UserProfile;
import dev.newdate.users.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserService userService;

    @Autowired
    UserProfileRepository userProfileRepository;

    @Override
    public UserProfile createUserProfile(String username, UserProfile userProfile) {
        User user = userService.getUser(username);
        user.setUserProfile(userProfile);
        return userService.createUser(user).getUserProfile();
    }

    @Override
    public UserProfile getUserProfile(String username) {
        return userProfileRepository.findProfileByUsername(username);
    }
}
