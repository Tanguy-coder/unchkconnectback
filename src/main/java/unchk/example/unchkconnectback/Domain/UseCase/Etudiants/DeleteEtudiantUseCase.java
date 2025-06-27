package unchk.example.unchkconnectback.Domain.UseCase.Etudiants;

import unchk.example.unchkconnectback.Domain.Port.EtudiantServiceInterface;

public class DeleteEtudiantUseCase implements DeleteEtudiantUseCaseInterface{
    private final EtudiantServiceInterface service;

    public DeleteEtudiantUseCase(EtudiantServiceInterface service) {
        this.service = service;
    }

    @Override
    public void execute(Long id) {
        this.service.delete(id);
    }
}
