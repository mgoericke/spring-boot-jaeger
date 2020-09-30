package de.javamark.other.web.rest;

import de.javamark.other.service.BackendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BackendResource {
    private final BackendService service;

    public BackendResource(final BackendService service) {
        this.service = service;
    }

    @GetMapping("/other-backend")
    public ResponseEntity getCompute() {
        return ResponseEntity.ok(this.service.computeOtherBackend());
    }
}
