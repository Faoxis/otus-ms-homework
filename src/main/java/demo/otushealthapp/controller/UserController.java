package demo.otushealthapp.controller;

import demo.otushealthapp.dto.UpdatedUserDto;
import demo.otushealthapp.dto.UserDto;
import demo.otushealthapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserDto save(@RequestBody UserDto user) {
        return userService.createUser(user);
    }

    @GetMapping(value = "{id}")
    public UserDto get(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping(value = "{id}")
    public UserDto update(@RequestBody UpdatedUserDto user, @PathVariable Long id) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
