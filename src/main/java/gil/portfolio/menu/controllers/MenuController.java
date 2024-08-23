package gil.portfolio.menu.controllers;

import gil.portfolio.menu.services.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/rest/mg/retrieveMenuList")
    public ResponseEntity<String> retrieveMenuListAll() {
        return ResponseEntity.ok("Menu");
    }
}
