package unchk.example.unchkconnectback.Infrastructure.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Presenter.UserPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.UserResponse;
import unchk.example.unchkconnectback.Domain.UseCase.User.CreateUserUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.GetUserByIdUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.User.ListUserUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.User.UpdateUserUseCase;

@RestController 
@RequestMapping("/api/users")
public class UserController {
    private final CreateUserUseCase create;
    private final ListUserUseCase getAll;
    private final UpdateUserUseCase update;
    private final GetUserByIdUseCaseInterface getById;
    // private final DeleteUserUseCase deleteUserUseCase;
    private final UserPresenterInterface presenter;

    public UserController(CreateUserUseCase create, ListUserUseCase getAll, UpdateUserUseCase update, GetUserByIdUseCaseInterface getById, UserPresenterInterface presenter) {
        this.create = create;
        this.getAll = getAll;
        this.update = update;
        this.getById = getById;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> index() {
        return ResponseEntity.ok(presenter.presentList(getAll.execute()));
    }

     @GetMapping("/{id}")
     public ResponseEntity<UserResponse> show(@PathVariable Long id) {
         return ResponseEntity.ok(presenter.presente(getById.execute(id)));
     }

    @PostMapping
    public ResponseEntity<UserResponse> store(@RequestBody DomainUser user) {
        DomainUser domain = create.execute(user);    
        return ResponseEntity.ok(presenter.presente(create.execute(domain)));
    }
//    @PutMapping("/{id}")
//    public ResponseEntity<UserResponse> update(@PathVariable Long id, @RequestBody DomainUser user) {
//        DomainUser updatedUser = update.execute(id, user);
//        return ResponseEntity.ok(presenter.presente(updatedUser));
//    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> destroy(@PathVariable Long id) {         
    //     deleteUserUseCase.execute(id);
    //     return ResponseEntity.noContent().build();
    //}


}
