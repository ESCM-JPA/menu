package gil.portfolio.menu.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @PostMapping("/rest/mg/retrieveMenuList")
    public ResponseEntity<String> retrieveMenuListAll() {
        return ResponseEntity.ok("Menu");
    }
}
