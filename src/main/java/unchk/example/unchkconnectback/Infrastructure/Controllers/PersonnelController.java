package unchk.example.unchkconnectback.Infrastructure.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unchk.example.unchkconnectback.Domain.Entity.DomainPersonnel;
import unchk.example.unchkconnectback.Domain.Presenter.PersonnelPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.PersonnelResponse;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.CreatePersonnelUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.GetPersonnelByIdUseCaseInterface;
import unchk.example.unchkconnectback.Domain.UseCase.Personnel.ListPersonnelUseCaseInterface;

import java.util.List;

@RestController
@RequestMapping("/api/personnels")
public class PersonnelController {
    private final PersonnelPresenterInterface presenter;
    private final CreatePersonnelUseCaseInterface save;
    private final ListPersonnelUseCaseInterface liste;
    private final GetPersonnelByIdUseCaseInterface show;

    public PersonnelController(PersonnelPresenterInterface presenter, CreatePersonnelUseCaseInterface save, ListPersonnelUseCaseInterface liste, GetPersonnelByIdUseCaseInterface show) {
        this.presenter = presenter;
        this.save = save;
        this.liste = liste;
        this.show = show;
    }

    @GetMapping
    public ResponseEntity<List<PersonnelResponse>> index(){
        return ResponseEntity.ok(presenter.presentList(liste.execute()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonnelResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.presente(show.execute(id)));
    }

    @PostMapping
    public ResponseEntity<PersonnelResponse> store(@RequestBody DomainPersonnel personnel){
        return ResponseEntity.ok(presenter.presente(save.execute(personnel)));
    }
}
