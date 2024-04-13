package service.users.dto;

import model.users.Artist;

public class NewArtistDto extends NewUserDto {

    public Artist toEntity() {
        return new Artist(username, password);
    }
}
