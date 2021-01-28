package dev.newdate.users.repository;

import dev.newdate.users.model.UserSettings;
import org.springframework.data.repository.CrudRepository;

public interface UserSettingsRepository extends CrudRepository<UserSettings, Long> {
}
