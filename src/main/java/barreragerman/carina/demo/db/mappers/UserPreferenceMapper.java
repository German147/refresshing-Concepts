package barreragerman.carina.demo.db.mappers;

import barreragerman.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);
}
