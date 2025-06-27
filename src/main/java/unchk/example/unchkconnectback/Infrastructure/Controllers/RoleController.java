package unchk.example.unchkconnectback.Infrastructure.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unchk.example.unchkconnectback.Domain.Entity.DomainRole;
import unchk.example.unchkconnectback.Domain.Presenter.RolePresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.RoleResponse;
import unchk.example.unchkconnectback.Domain.UseCase.Role.CreateRoleUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Role.GetRoleByIdUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Role.ListRoleUseCaseInterface;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private final CreateRoleUseCaseInterface create;
    private final ListRoleUseCaseInterface getAll;
    private final GetRoleByIdUseCaseInterface show;
    private final RolePresenterInterface presenter;

    public RoleController(CreateRoleUseCaseInterface create, ListRoleUseCaseInterface getAll, GetRoleByIdUseCaseInterface show, RolePresenterInterface presenter) {
        this.create = create;
        this.getAll = getAll;
        this.show = show;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity<List<RoleResponse>> index(){
        return ResponseEntity.ok(presenter.presentList(getAll.execute()));
    }
    @PostMapping
    public ResponseEntity<RoleResponse> store(@RequestBody DomainRole role){
        return ResponseEntity.ok(presenter.presente(create.execute(role)));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RoleResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.presente(show.execute(id)));
    }

}
