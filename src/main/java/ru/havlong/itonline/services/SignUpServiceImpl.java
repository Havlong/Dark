package ru.havlong.itonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.havlong.itonline.forms.UserForm;
import ru.havlong.itonline.models.Role;
import ru.havlong.itonline.models.State;
import ru.havlong.itonline.models.User;
import ru.havlong.itonline.repositories.UsersRepository;

/**
 * 21.02.19
 * SignUpServiceImpl
 *
 * @author Havlong
 * @version v1.0
 */
@Service
public class SignUpServiceImpl implements SignUpService {

    private final UsersRepository usersRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SignUpServiceImpl(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .userName(userForm.getUsername())
                .hashPassword(hashPassword)
                .role(Role.USER)
                .state(State.ACTIVE)
                .build();

        usersRepository.save(user);
    }
}
