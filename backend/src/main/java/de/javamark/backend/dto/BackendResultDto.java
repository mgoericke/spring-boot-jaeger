package de.javamark.backend.dto;

import java.io.Serializable;

public class BackendResultDto implements Serializable {
    private String backendName;
    private String otherBackendName;

    public BackendResultDto() {
    }

    public String getBackendName() {
        return this.backendName;
    }

    public void setBackendName(final String backendName) {
        this.backendName = backendName;
    }

    public String getOtherBackendName() {
        return this.otherBackendName;
    }

    public void setOtherBackendName(final String otherBackendName) {
        this.otherBackendName = otherBackendName;
    }
}
