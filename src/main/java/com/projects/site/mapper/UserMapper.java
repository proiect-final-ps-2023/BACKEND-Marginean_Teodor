package com.projects.site.mapper;

import com.projects.site.DTO.UserDTO;
import com.projects.site.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public static UserDTO mapModelToDto(User user)
    {
        UserDTO x = new UserDTO();
        x.setId(user.getId());
        x.setName(user.getName());
        x.setPassw(user.getPassw());
        x.setAdmin(user.getAdmin());
        return x;
    }
    public static User mapDtoToModel(UserDTO user)
    {
        User x= new User();
        x.setPassw(user.getPassw());
        x.setId(user.getId());
        x.setAdmin(user.getAdmin());
        x.setName(user.getName());
        return x;
    }
}
