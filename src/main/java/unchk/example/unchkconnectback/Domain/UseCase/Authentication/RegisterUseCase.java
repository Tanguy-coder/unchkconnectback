package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import org.springframework.security.crypto.password.PasswordEncoder;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Gateway.UserRepositoryInterface;

public class RegisterUseCase implements RegisterUseCaseInterface{
    private final UserRepositoryInterface userRepository;
    private final PasswordEncoder passwordEncoder;

    public RegisterUseCase(UserRepositoryInterface userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public DomainUser execute(DomainUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
