package de.javamark.backend.dto;

import java.io.Serializable;

public class OtherBackendResultDto implements Serializable {
    private String otherBackendMessage;

    public OtherBackendResultDto() {
    }

    public String getOtherBackendMessage() {
        return this.otherBackendMessage;
    }

    public void setOtherBackendMessage(final String otherBackendMessage) {
        this.otherBackendMessage = otherBackendMessage;
    }
}
