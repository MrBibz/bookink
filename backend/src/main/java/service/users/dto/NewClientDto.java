package service.users.dto;

import model.users.Client;

public class NewClientDto extends NewUserDto {

    public Client toEntity() {
        return new Client(username, password);
    }
}
