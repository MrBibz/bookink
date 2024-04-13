package ca.bibz.service;

import ca.bibz.service.dto.ArtistDto;
import ca.bibz.service.dto.NewArtistDto;
import ca.bibz.repository.users.ArtistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {

    private final ArtistRepository artistRepository;

    public ArtistDto createArtist(NewArtistDto artist) {
        return artistRepository.save(artist.toEntity()).toDto();
    }
}
