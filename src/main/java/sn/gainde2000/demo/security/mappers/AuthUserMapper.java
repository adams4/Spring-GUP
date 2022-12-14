package sn.gainde2000.demo.security.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthUserMapper {

	AuthUserMapper INSTANCE = Mappers.getMapper(AuthUserMapper.class);

	Utilisateurs convertToUtilisateurs(RegistrationRequest registrationRequest);

	AuthenticatedUserDto convertToAuthenticatedUserDto(Utilisateurs user);

	Utilisateurs convertToUtilisateurs(AuthenticatedUserDto authenticatedUserDto);

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package sn.gainde2000.demo.security.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthUserMapper {

	AuthUserMapper INSTANCE = Mappers.getMapper(AuthUserMapper.class);

	Utilisateurs convertToUtilisateurs(RegistrationRequest registrationRequest);

	AuthenticatedUserDto convertToAuthenticatedUserDto(Utilisateurs user);

	Utilisateurs convertToUtilisateurs(AuthenticatedUserDto authenticatedUserDto);

}
