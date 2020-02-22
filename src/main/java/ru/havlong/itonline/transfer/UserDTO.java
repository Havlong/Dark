package ru.havlong.itonline.transfer;

import lombok.Builder;
import lombok.Data;
import ru.havlong.itonline.models.Role;
import ru.havlong.itonline.models.User;

/**
 * 21.02.19
 * UserDTO
 *
 * @author Havlong
 * @version v1.0
 */
@Data
@Builder
public class UserDTO {
    private String userName;
    private String firstName;
    private String lastName;
    private Role role;

    public static UserDTO from(User user) {
        return UserDTO.builder()
                .userName(user.getUserName())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .role(user.getRole())
                .build();
    }
}
