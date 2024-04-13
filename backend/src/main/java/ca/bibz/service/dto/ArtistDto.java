package ca.bibz.service.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArtistDto extends UserDto {

    public ArtistDto(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
