package unchk.example.unchkconnectback.Infrastructure.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unchk.example.unchkconnectback.Domain.Entity.DomainEtudiant;
import unchk.example.unchkconnectback.Domain.Presenter.EtudiantPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.EtudiantResponse;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.CreateEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.DeleteEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.GetEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Etudiants.ListEtudiantUseCase;
import unchk.example.unchkconnectback.Domain.UseCase.Formation.GetFormationByIdUseCase;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
    private final ListEtudiantUseCase getAll;
    private final GetEtudiantUseCase getById;
    private final CreateEtudiantUseCase create;
    private final DeleteEtudiantUseCase delete;
    private final GetFormationByIdUseCase show;
    private final EtudiantPresenterInterface presenter;

    public EtudiantController(ListEtudiantUseCase getAll, GetEtudiantUseCase getById, CreateEtudiantUseCase create, DeleteEtudiantUseCase delete, GetFormationByIdUseCase show, EtudiantPresenterInterface presenter) {
        this.getAll = getAll;
        this.getById = getById;
        this.create = create;
        this.delete = delete;
        this.show = show;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity<List<EtudiantResponse>> index() {
        return ResponseEntity.ok(presenter.presentList(getAll.execute()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EtudiantResponse> show(@PathVariable Long id) {
        return ResponseEntity.ok(presenter.presente(getById.execute(id)));
    }

    @PostMapping
    public ResponseEntity<EtudiantResponse> store(@RequestBody DomainEtudiant etudiant) {
        DomainEtudiant domain = create.execute(etudiant);
        return ResponseEntity.ok(presenter.presente(domain));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> destroy(@PathVariable Long id) {
        delete.execute(id);
        return ResponseEntity.noContent().build();
    }
}
