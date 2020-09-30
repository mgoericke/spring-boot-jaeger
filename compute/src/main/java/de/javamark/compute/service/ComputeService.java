package de.javamark.compute.service;

import de.javamark.compute.dto.BackendResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {

    private final RestTemplate restTemplate;
    private final String backendUrl;

    public ComputeService(final RestTemplate restTemplate,
                          @Value("${application.backend.url}") final String backendUrl) {
        this.restTemplate = restTemplate;
        this.backendUrl = backendUrl;
    }

    public BackendResultDto compute() {
        final BackendResultDto fromBackend = this.restTemplate.getForObject(this.backendUrl, BackendResultDto.class);
        assert fromBackend != null;
        final BackendResultDto backendResultDto = new BackendResultDto();
        backendResultDto.setBackendName(fromBackend.getBackendName());
        backendResultDto.setOtherBackendName(fromBackend.getOtherBackendName());
        backendResultDto.setName("I am Compute");
        return backendResultDto;
    }
}
