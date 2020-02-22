package ru.havlong.itonline.forms;

import lombok.Data;

/**
 * 21.02.19
 * UserForm
 *
 * @author Havlong
 * @version v1.0
 */
@Data
public class UserForm {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String repeatPassword;
}
