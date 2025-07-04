package unchk.example.unchkconnectback.Infrastructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Presenter.AuthPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.AuthResponse;
import unchk.example.unchkconnectback.Domain.UseCase.Authentication.LoginUseCaseInterface;
import unchk.example.unchkconnectback.Infrastructure.Requests.LoginRequest;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    private final LoginUseCaseInterface loginUseCase;
    private final AuthPresenterInterface presenter;

    public AuthController(LoginUseCaseInterface loginUseCase, AuthPresenterInterface presenter) {
        this.loginUseCase = loginUseCase;
        this.presenter = presenter;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            String token = loginUseCase.execute(loginRequest.getEmail(), loginRequest.getPassword());
            DomainUser user = loginUseCase.findByEmail(loginRequest.getEmail());
            System.out.println("Login successful for email: " + loginRequest.getEmail());
            return ResponseEntity.ok(presenter.presentWithToken(user, token));
        } catch (RuntimeException e) {
            System.out.println("Error in AuthController: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Échec de la connexion: " + e.getMessage());
        }
    }
}

