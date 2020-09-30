package de.javamark.backend.service;

import de.javamark.backend.dto.BackendResultDto;
import de.javamark.backend.dto.OtherBackendResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BackendService {

    private final RestTemplate restTemplate;
    private final String backendUrl;

    public BackendService(final RestTemplate restTemplate,
                          @Value("${application.other-backend.url}") final String backendUrl) {
        this.restTemplate = restTemplate;
        this.backendUrl = backendUrl;
    }

    public BackendResultDto computeBackend() {
        final OtherBackendResultDto fromOtherBackend = this.restTemplate
                .getForObject(
                        this.backendUrl,
                        OtherBackendResultDto.class);
        assert fromOtherBackend != null;
        final BackendResultDto backendResult = new BackendResultDto();
        backendResult.setBackendName("I am the backend");
        backendResult.setOtherBackendName(fromOtherBackend.getOtherBackendMessage());
        return backendResult;
    }
}
