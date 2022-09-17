package co.lecompany.app.security;

import co.lecompany.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
