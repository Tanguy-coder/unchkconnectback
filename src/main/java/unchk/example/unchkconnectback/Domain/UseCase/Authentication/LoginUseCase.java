package unchk.example.unchkconnectback.Domain.UseCase.Authentication;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.AuthServiceInterface;
import unchk.example.unchkconnectback.Domain.Port.UserServiceInterface;
import unchk.example.unchkconnectback.Infrastructure.Adapter.AuthService;

public class LoginUseCase implements LoginUseCaseInterface{

    private final AuthServiceInterface authService;
    private final UserServiceInterface  userService;

    public LoginUseCase(AuthServiceInterface authService, UserServiceInterface userService) {
        this.authService = authService;
        this.userService = userService;
    }


    @Override
    public String execute(String email, String password) {
        DomainUser user = findByEmail(email);
        return authService.authenticateAndGenerateToken(user, password);
    }

    @Override
    public DomainUser findByEmail(String email) {
        return userService.findByEmail(email);
    }
}
