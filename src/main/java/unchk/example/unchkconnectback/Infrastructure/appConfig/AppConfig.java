package unchk.example.unchkconnectback.Infrastructure.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import unchk.example.unchkconnectback.Domain.Port.AuthServiceInterface;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Authentication.LoginUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Authentication.LoginUseCaseInterface;

public class AppConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public LoginUseCase loginUseCase(AuthServiceInterface authServiceInterface, UserServiceInterface userServiceInterface) {
        return new LoginUseCase(authServiceInterface, userServiceInterface);
    }
}
