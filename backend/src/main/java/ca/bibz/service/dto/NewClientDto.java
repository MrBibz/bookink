package ca.bibz.service.dto;

import ca.bibz.model.users.Client;

public class NewClientDto extends NewUserDto {

    public Client toEntity() {
        return new Client(username, password);
    }
}
