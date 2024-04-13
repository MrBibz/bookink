package ca.bibz.model.interaction;

import ca.bibz.model.users.Artist;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {

    @Id
    private String id;

    private String title, caption, image;

    @DBRef
    private Artist artist;

    @Override
    public String toString() {
        return String.format("""
                Post[
                   id=%s,\s
                   title=%s,\s
                   caption=%s
                ]
                """, id, title, caption);
    }
}
