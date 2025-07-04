package unchk.example.unchkconnectback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import unchk.example.unchkconnectback.Domain.Port.*;
import unchk.example.unchkconnectback.Domain.UseCase.Authentication.LoginUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.CreateEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.DeleteEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.GetEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.ListEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.UpdateEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.CreateFormationUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.GetFormationByIdUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.ListFormationUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.UpdateFormationUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.CreatePersonnelUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.GetPersonnelByIdUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.ListPersonnelUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Role.CreateRoleUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Role.GetRoleByIdUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Role.ListRoleUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.CreateUserUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.GetUserByIdUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.ListUserUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.UpdateUserUseCase;
import unchk.example.unchkconnectback.Infrastructure.Mapper.*;
import unchk.example.unchkconnectback.Infrastructure.Presenter.*;

@SpringBootApplication
public class UnchkconnectbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnchkconnectbackApplication.class, args);
	}

	@Bean
	public EtudiantPresenter  etudiantPresenter(EtudiantMapper mapper){
		return new EtudiantPresenter(mapper);
	}

	@Bean
	public AuthPresenter authPresenter(){
		return new AuthPresenter();
	}

	@Bean
	public UserPresenter userPresenter(UserMapper mapper){
		return new UserPresenter(mapper);
	}

	@Bean
	public RolePresenter rolePresenter(RoleMapper mapper){
		return new RolePresenter(mapper);
	}

	@Bean
	public FormationPresenter formationPresenter(FormationMapper mapper)
	{
		return new FormationPresenter(mapper);
	}

	@Bean
	public PersonnelPresenter personnelPresenter(PersonnelMapper mapper)
	{
		return new PersonnelPresenter(mapper);
	}

/***********************************************UseCases*********************************************** */

	@Bean
	public LoginUseCase loginUseCase(AuthServiceInterface authServiceInterface,UserServiceInterface userServiceInterface){
		return new LoginUseCase(authServiceInterface, userServiceInterface);
	}
	@Bean
	public CreatePersonnelUseCase createPersonnelUseCase(PersonnelServiceInterface serviceInterface){
		return  new CreatePersonnelUseCase(serviceInterface);
	}

	@Bean
	public ListPersonnelUseCase listPersonnelUseCase(PersonnelServiceInterface serviceInterface){
		return  new ListPersonnelUseCase(serviceInterface);
	}

	@Bean
	public GetPersonnelByIdUseCase getPersonnelByIdUseCase(PersonnelServiceInterface serviceInterface){
		return  new GetPersonnelByIdUseCase(serviceInterface);
	}

	@Bean
	public CreateFormationUseCase createFormationUseCase(FormationServiceInterface serviceInterface){
		return  new CreateFormationUseCase(serviceInterface);
	}

	@Bean
	public ListFormationUseCase listFormationUseCase(FormationServiceInterface serviceInterface){
		return  new ListFormationUseCase(serviceInterface);
	}

	@Bean
	public UpdateFormationUseCase updateFormationUseCase(FormationServiceInterface serviceInterface){
		return  new UpdateFormationUseCase(serviceInterface);
	}
	@Bean
	public GetFormationByIdUseCase getFormationByIdUseCase(FormationServiceInterface serviceInterface){
		return  new GetFormationByIdUseCase(serviceInterface);
	}
	@Bean
	public CreateEtudiantUseCase etudiantUseCase(EtudiantServiceInterface etudiantServiceInterface){
		return new CreateEtudiantUseCase(etudiantServiceInterface);
	}

	@Bean
	public ListEtudiantUseCase listEtudiantUseCase(EtudiantServiceInterface etudiantServiceInterface){
		return new ListEtudiantUseCase(etudiantServiceInterface);
	}
	@Bean
	public GetEtudiantUseCase getEtudiantUseCase(EtudiantServiceInterface etudiantServiceInterface) {
		return new GetEtudiantUseCase(etudiantServiceInterface);
	}


	@Bean
	public UpdateEtudiantUseCase updateEtudiantUseCase(EtudiantServiceInterface etudiantServiceInterface) {
		return new UpdateEtudiantUseCase(etudiantServiceInterface);
	}

	@Bean
	public DeleteEtudiantUseCase deleteEtudiantUseCase(EtudiantServiceInterface etudiantServiceInterface) {
		return new DeleteEtudiantUseCase(etudiantServiceInterface);
	}

	@Bean
	public ListUserUseCase listUserUseCase(UserServiceInterface userServiceInterface) {
		return new ListUserUseCase(userServiceInterface);
	}
	@Bean
	public GetUserByIdUseCase getUserByIdUseCase(UserServiceInterface userServiceInterface) {
		return new GetUserByIdUseCase(userServiceInterface);
	}
	@Bean
	public CreateUserUseCase createUserUseCase(UserServiceInterface userServiceInterface) {
		return new CreateUserUseCase(userServiceInterface);
	}
	@Bean
	public UpdateUserUseCase updateUserUseCase(UserServiceInterface userServiceInterface){
		return new UpdateUserUseCase(userServiceInterface);
	}
	@Bean
	public CreateRoleUseCase createRoleUseCase(RoleServiceInterface roleServiceInterface){
		return new CreateRoleUseCase(roleServiceInterface);
	}

	@Bean
	public ListRoleUseCase listRoleUseCase(RoleServiceInterface roleServiceInterface){
		return new ListRoleUseCase(roleServiceInterface);
	}

	@Bean
	public GetRoleByIdUseCase getRoleByIdUseCase(RoleServiceInterface roleServiceInterface){
		return new GetRoleByIdUseCase(roleServiceInterface);
	}

}
