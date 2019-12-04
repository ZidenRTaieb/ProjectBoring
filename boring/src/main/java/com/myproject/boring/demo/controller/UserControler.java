package com.myproject.boring.demo.controller;

import com.myproject.boring.demo.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boring")
public class UserControler {

    @PostMapping(path = "/add", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public UserDTO addUserSubmit(@ModelAttribute CreateUSerDTO createUserDTO) {
        if (createUserDTO.getFile() != null) {
            imageServiceImpl.storeAvatar(createUserDTO.getFile());
            createUserDTO.setImageUrl(createUserDTO.getFile().getOriginalFilename());
        }
        animalsService.createAnimal(createUserDTO.getName(), createUserDTO.getCategory(), createUserDTO.getEnvironment(), createUserDTO.getImageUrl(), createUserDTO.getOrganList());
        User user = animalsService.showSpecificAnimal(createUserDTO.getName());
        return animal.toAnimalsDto();
    }

}
