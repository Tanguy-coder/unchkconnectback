package unchk.example.unchkconnectback.Infrastructure.appConfig;


import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import unchk.example.unchkconnectback.Infrastructure.Mapper.UserMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Role;
import unchk.example.unchkconnectback.Infrastructure.Models.User;
import unchk.example.unchkconnectback.Infrastructure.Repositories.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper mapper;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMapper mapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.mapper = mapper;
    }

    @Override
    public void run(String... args) {
        Role adminRole = new Role();
        adminRole.setNom("ADMIN");
        Role etudiantRole = new Role();
        etudiantRole.setNom("ETUDIANT");
        Role formateurRole = new Role();
        formateurRole.setNom("FORMATEUR");
        Role appuiInsertionRole = new Role();
        appuiInsertionRole.setNom("APPUI_INSERTION");

        User admin = new User();
        admin.setNom("Admin");
        admin.setPrenom("User");
        admin.setEmail("admin@uchk.sn");
        admin.setPassword(passwordEncoder.encode("admin123"));
        admin.setContact("123456789");
        admin.setRole(adminRole);

        User savedUser = userRepository.save(admin);
    }
}
