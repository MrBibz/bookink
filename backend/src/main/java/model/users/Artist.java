package model.users;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artists")
public class Artist extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public Artist(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return String.format("""
                Artist[
                   id=%s,\s
                   username=%s,\s
                   password=%s
                ]
                """, id, username, password);
    }
}
