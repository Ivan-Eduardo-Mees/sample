package com.application.dto.user;

import com.application.entity.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
