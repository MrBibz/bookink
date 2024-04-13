package ca.bibz.model.users;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class Client extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public Client(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return String.format("""
                Client[
                   id=%s,\s
                   username=%s,\s
                   password=%s
                ]
                """, id, username, password);
    }
}
