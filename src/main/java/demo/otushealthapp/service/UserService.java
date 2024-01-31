package demo.otushealthapp.service;

import demo.otushealthapp.dto.UpdatedUserDto;
import demo.otushealthapp.dto.UserDto;
import demo.otushealthapp.entity.User;
import demo.otushealthapp.exception.NoSuchUserException;
import demo.otushealthapp.mapper.UserMapper;
import demo.otushealthapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    final private UserRepository userRepository;
    final private UserMapper userMapper;

    public UserDto createUser(UserDto user) {
        User newUser = userMapper.mapToUser(user);
        userRepository.save(newUser);
        return userMapper.mapToUserDto(newUser);
    }

    public UserDto getUser(Long id) {
        return userRepository
            .findById(id)
            .map(userMapper::mapToUserDto)
            .orElseThrow(NoSuchUserException::new);
    }

    public void deleteUser(Long id) {
        User user = userRepository
            .findById(id)
            .orElseThrow(NoSuchUserException::new);
        userRepository.delete(user);
    }

    public UserDto updateUser(UpdatedUserDto user, final Long id) {
        User updatedUser = userRepository
            .findById(id)
            .map(userFromDb -> userMapper.mapUpdatedUser(user, userFromDb))
            .orElseThrow(NoSuchUserException::new);
        return userMapper.mapToUserDto(updatedUser);
    }
}
