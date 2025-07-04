package unchk.example.unchkconnectback.Infrastructure.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unchk.example.unchkconnectback.Domain.Entity.DomainFormation;
import unchk.example.unchkconnectback.Domain.Presenter.FormationPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.FormationResponse;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.CreateFormationUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.GetFormationByIdUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.ListFormationUseCseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.UpdateFormationUseCaseInterface;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {
    private final FormationPresenterInterface presenter;
    private final ListFormationUseCseInterface getAll;
    private final CreateFormationUseCaseInterface create;
    private final UpdateFormationUseCaseInterface update;
    private final GetFormationByIdUseCaseInterface show;

    public FormationController(FormationPresenterInterface presenter, ListFormationUseCseInterface getAll, CreateFormationUseCaseInterface create, UpdateFormationUseCaseInterface update, GetFormationByIdUseCaseInterface show) {
        this.presenter = presenter;
        this.getAll = getAll;
        this.create = create;
        this.update = update;
        this.show = show;
    }

    @GetMapping
    public ResponseEntity<List<FormationResponse>> index(){
        return ResponseEntity.ok(presenter.presente(getAll.execute()));
    }

    @PostMapping
    public ResponseEntity<FormationResponse> store(@RequestBody DomainFormation formation){
        System.out.println("formation IN: " + formation);
        DomainFormation domain = create.execute(formation);
        System.out.println("formation OUT: " + domain);
        return ResponseEntity.ok(presenter.presente(domain));
    }

    @PutMapping
    public ResponseEntity<FormationResponse> update(@RequestBody DomainFormation formation){
        DomainFormation domain = update.execute(formation);
        return ResponseEntity.ok(presenter.presente(domain));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormationResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.presente(show.execute(id)));
    }
}
