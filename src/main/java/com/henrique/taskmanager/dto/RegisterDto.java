package com.henrique.taskmanager.dto;

import com.henrique.taskmanager.enums.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
