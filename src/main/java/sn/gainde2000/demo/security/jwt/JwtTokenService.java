package sn.gainde2000.demo.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.LoginRequest;
import sn.gainde2000.demo.security.dto.LoginResponse;
import sn.gainde2000.demo.security.mappers.AuthUserMapper;

@Service
public class JwtTokenService {
    static final Logger log = LoggerFactory.getLogger(JwtTokenService.class);

    private final IUtilisateurs userService;

    private final JwtTokenManager jwtTokenManager;

    private final AuthenticationManager authenticationManager;

    public JwtTokenService(IUtilisateurs userService, JwtTokenManager jwtTokenManager, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.jwtTokenManager = jwtTokenManager;
        this.authenticationManager = authenticationManager;
    }

    public LoginResponse getLoginResponse(LoginRequest loginRequest) {

        final String username = loginRequest.getUsername();
        final String password = loginRequest.getPassword();

        final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        final AuthenticatedUserDto authenticatedUserDto = userService.findAuthenticatedUtilisateursByUsername(username);

        final Utilisateurs user = AuthUserMapper.INSTANCE.convertToUtilisateurs(authenticatedUserDto);
        final String token = jwtTokenManager.generateToken(user);

        log.info(" {} has successfully logged in!", user.getUsername());

        return new LoginResponse(token);
    }
}
                                                                                                                                                                                                                                                package sn.gainde2000.demo.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.LoginRequest;
import sn.gainde2000.demo.security.dto.LoginResponse;
import sn.gainde2000.demo.security.mappers.AuthUserMapper;

@Service
public class JwtTokenService {
    static final Logger log = LoggerFactory.getLogger(JwtTokenService.class);

    private final IUtilisateurs userService;

    private final JwtTokenManager jwtTokenManager;

    private final AuthenticationManager authenticationManager;

    public JwtTokenService(IUtilisateurs userService, JwtTokenManager jwtTokenManager, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.jwtTokenManager = jwtTokenManager;
        this.authenticationManager = authenticationManager;
    }

    public LoginResponse getLoginResponse(LoginRequest loginRequest) {

        final String username = loginRequest.getUsername();
        final String password = loginRequest.getPassword();

        final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        final AuthenticatedUserDto authenticatedUserDto = userService.findAuthenticatedUtilisateursByUsername(username);

        final Utilisateurs user = AuthUserMapper.INSTANCE.convertToUtilisateurs(authenticatedUserDto);
        final String token = jwtTokenManager.generateToken(user);

        log.info(" {} has successfully logged in!", user.getUsername());

        return new LoginResponse(token);
    }
}
