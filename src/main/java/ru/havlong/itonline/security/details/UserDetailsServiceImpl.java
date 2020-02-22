package ru.havlong.itonline.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.havlong.itonline.repositories.UsersRepository;

/**
 * 21.02.19
 * UserDetailsServiceImpl
 *
 * @author Havlong
 * @version v1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserDetailsServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new
                UserDetailsImpl(usersRepository.findOneByUserName(userName)
                .orElseThrow(IllegalArgumentException::new));
    }
}
