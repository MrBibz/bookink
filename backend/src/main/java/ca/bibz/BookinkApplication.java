package ca.bibz;

import ca.bibz.service.AdminService;
import ca.bibz.service.dto.NewArtistDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class BookinkApplication implements CommandLineRunner {

    private final AdminService adminService;

    public BookinkApplication(AdminService adminService) {
        this.adminService = adminService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookinkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        adminService.createArtist(new NewArtistDto("artist", "password"));
    }
}
