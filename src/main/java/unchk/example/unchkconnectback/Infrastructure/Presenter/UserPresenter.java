package unchk.example.unchkconnectback.Infrastructure.Presenter;

import unchk.example.unchkconnectback.Domain.Entity.DomainUser;
import unchk.example.unchkconnectback.Domain.Presenter.UserPresenterInterface;
import unchk.example.unchkconnectback.Domain.Response.UserResponse;
import unchk.example.unchkconnectback.Infrastructure.Mapper.UserMapper;

import java.util.List;

public class UserPresenter implements UserPresenterInterface {
    private final UserMapper mapper;

    public UserPresenter(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UserResponse presente(DomainUser domainUser) {
        return mapper.toResponse(domainUser);
    }

    @Override
    public List<UserResponse> presentList(List<DomainUser> domainUsers) {
        return mapper.toResponseList(domainUsers);
    }
}
