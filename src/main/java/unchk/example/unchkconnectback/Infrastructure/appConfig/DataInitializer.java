package unchk.example.unchkconnectback.Infrastructure.appConfig;


import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Infrastructure.Mapper.UserMapper;
import unchk.example.unchkconnectback.Infrastructure.Models.Role;
import unchk.example.unchkconnectback.Infrastructure.Models.User;
import unchk.example.unchkconnectback.Infrastructure.Repositories.RoleRepository;
import unchk.example.unchkconnectback.Infrastructure.Repositories.UserRepository;

//@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMapper mapper, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        // Create and save roles
        DomainRole adminRole = new DomainRole();
        adminRole.setNom("ADMIN");
        DomainRole savedAdminRole = roleRepository.save(adminRole);

        DomainRole etudiantRole = new DomainRole();
        etudiantRole.setNom("ETUDIANT");
        roleRepository.save(etudiantRole);

        DomainRole formateurRole = new DomainRole();
        formateurRole.setNom("FORMATEUR");
        roleRepository.save(formateurRole);

        DomainRole appuiInsertionRole = new DomainRole();
        appuiInsertionRole.setNom("APPUI_INSERTION");
        roleRepository.save(appuiInsertionRole);

        // Create and save admin user
        DomainUser admin = new DomainUser();
        admin.setNom("Etudiant ");
        admin.setPrenom("User2");
        admin.setEmail("etudiant@uchk.sn");
        admin.setPassword(passwordEncoder.encode("admin123"));
        admin.setContact("123456789");
        admin.setRole(etudiantRole);

        userRepository.save(admin);
    }
}
