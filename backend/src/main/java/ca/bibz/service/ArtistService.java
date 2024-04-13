package ca.bibz.service;

import ca.bibz.repository.users.ArtistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;

}
