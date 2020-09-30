package de.javamark.other.service;

import de.javamark.other.dto.OtherBackendResultDto;
import org.springframework.stereotype.Service;

@Service
public class BackendService {

    public BackendService() {
    }

    public OtherBackendResultDto computeOtherBackend() {
        final OtherBackendResultDto resultDto = new OtherBackendResultDto();
        resultDto.setOtherBackendMessage("I am the other backend");
        return resultDto;
    }
}
