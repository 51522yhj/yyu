package com.yupi.yudada.model.dto.user;

import lombok.Data;

@Data
public class PasswordResetRequest {
    private String oldPassword;
    private String newPassword;
}
