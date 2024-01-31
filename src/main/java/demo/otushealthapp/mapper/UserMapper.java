package demo.otushealthapp.mapper;

import demo.otushealthapp.dto.UpdatedUserDto;
import demo.otushealthapp.dto.UserDto;
import demo.otushealthapp.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserMapper {

    public User mapToUser(UserDto userDto) {
        return new User()
            .setPhone(userDto.getPhone())
            .setEmail(userDto.getEmail())
            .setUsername(userDto.getUsername())
            .setFirstName(userDto.getFirstName())
            .setLastName(userDto.getLastName())
            .setCreatedAt(LocalDateTime.now());
    }

    public UserDto mapToUserDto(User user) {
        return new UserDto()
            .setId(user.getId())
            .setPhone(user.getPhone())
            .setEmail(user.getEmail())
            .setUsername(user.getUsername())
            .setFirstName(user.getFirstName())
            .setLastName(user.getLastName())
            .setCreatedAt(user.getCreatedAt());
    }

    public User mapUpdatedUser(UpdatedUserDto updatedUser, User user) {
        return user
            .setEmail(updatedUser.getEmail())
            .setLastName(updatedUser.getLastName())
            .setFirstName(updatedUser.getFirstName())
            .setPhone(updatedUser.getPhone());
    }

//    public

}
