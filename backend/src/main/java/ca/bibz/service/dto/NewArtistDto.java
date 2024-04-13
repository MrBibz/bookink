package ca.bibz.service.dto;

import ca.bibz.model.users.Artist;

public class NewArtistDto extends NewUserDto {

    public NewArtistDto(String username, String password) {
        super(username, password);
    }

    public Artist toEntity() {
        return new Artist(username, password);
    }
}
