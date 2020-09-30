package de.javamark.compute.web.rest;

import de.javamark.compute.service.ComputeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ComputeResource {
    private final ComputeService service;

    public ComputeResource(final ComputeService service) {
        this.service = service;
    }

    @GetMapping("/compute")
    public ResponseEntity getCompute() {
        return ResponseEntity.ok(this.service.compute());
    }
}
