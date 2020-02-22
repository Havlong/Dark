package ru.havlong.itonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.havlong.itonline.models.User;

import java.util.Optional;

/**
 * 21.02.19
 * UsersRepository
 *
 * @author Havlong
 * @version v1.0
 */
public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByUserName(String userName);
}
