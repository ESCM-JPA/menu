package gil.portfolio.menu.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements MenuRetrieveService {

    @Override
    public List retirieveMenu() {
        return List.of();
    }
}
