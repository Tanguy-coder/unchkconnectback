package unchk.example.unchkconnectback.Infrastructure.Adapter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Port.AuthServiceInterface;

import java.util.Date;
@Service
public class AuthService implements AuthServiceInterface {

    private final PasswordEncoder passwordEncoder;

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExpiration;

    public AuthService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String authenticateAndGenerateToken(DomainUser user, String password) {
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Mot de passe incorrect");
        }
        return Jwts.builder()
                .setSubject(user.getEmail())
                .claim("role", user.getRole().getNom())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(Keys.hmacShaKeyFor(jwtSecret.getBytes()))
                .compact();
    }
}