package com.application.dto.user;

import com.application.model.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
