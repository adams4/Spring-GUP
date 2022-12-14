package sn.gainde2000.demo.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.security.utils.SecurityConstants;

import java.util.Date;

@Component
public class JwtTokenManager {

    // FIXME : Customize JWT token management for your application
    public String generateToken(Utilisateurs user) {

        final String username = user.getUsername();
        final Profil userRole = user.getProfil();

        final Claims claims = Jwts.claims().setSubject(username);
        claims.put("role", userRole.getNomProfil());

        final long currentTimeMillis = System.currentTimeMillis();

        return Jwts.builder()
                .setClaims(claims)
                .setIssuer(SecurityConstants.ISSUER)
                .setIssuedAt(new Date(currentTimeMillis))
                .setExpiration(new Date(currentTimeMillis + SecurityConstants.EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SecurityConstants.SECRET_KEY)
                .compact();
    }

    public String getUsernameFromToken(String token) {

        final Claims claims = getAllClaimsFromToken(token);
        return claims.getSubject();
    }

    public boolean validateToken(String token, String authenticatedUsername) {

        final String usernameFromToken = getUsernameFromToken(token);

        final boolean equalsUsername = usernameFromToken.equals(authenticatedUsername);
        final boolean tokenExpired = isTokenExpired(token);

        return equalsUsername && !tokenExpired;
    }

    private boolean isTokenExpired(String token) {

        final Date expirationDateFromToken = getExpirationDateFromToken(token);
        return expirationDateFromToken.before(new Date());
    }

    private Date getExpirationDateFromToken(String token) {

        final Claims claims = getAllClaimsFromToken(token);
        return claims.getExpiration();
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(SecurityConstants.SECRET_KEY).parseClaimsJws(token).getBody();
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           package sn.gainde2000.demo.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.security.utils.SecurityConstants;

import java.util.Date;

@Component
public class JwtTokenManager {

    // FIXME : Customize JWT token management for your application
    public String generateToken(Utilisateurs user) {

        final String username = user.getUsername();
        final Profil userRole = user.getProfil();

        final Claims claims = Jwts.claims().setSubject(username);
        claims.put("role", userRole.getNomProfil());

        final long currentTimeMillis = System.currentTimeMillis();

        return Jwts.builder()
                .setClaims(claims)
                .setIssuer(SecurityConstants.ISSUER)
                .setIssuedAt(new Date(currentTimeMillis))
                .setExpiration(new Date(currentTimeMillis + SecurityConstants.EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SecurityConstants.SECRET_KEY)
                .compact();
    }

    public String getUsernameFromToken(String token) {

        final Claims claims = getAllClaimsFromToken(token);
        return claims.getSubject();
    }

    public boolean validateToken(String token, String authenticatedUsername) {

        final String usernameFromToken = getUsernameFromToken(token);

        final boolean equalsUsername = usernameFromToken.equals(authenticatedUsername);
        final boolean tokenExpired = isTokenExpired(token);

        return equalsUsername && !tokenExpired;
    }

    private boolean isTokenExpired(String token) {

        final Date expirationDateFromToken = getExpirationDateFromToken(token);
        return expirationDateFromToken.before(new Date());
    }

    private Date getExpirationDateFromToken(String token) {

        final Claims claims = getAllClaimsFromToken(token);
        return claims.getExpiration();
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(SecurityConstants.SECRET_KEY).parseClaimsJws(token).getBody();
    }
}
