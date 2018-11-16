package org.anuruddha.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIDefinition {
    private String path;
    private String method;
}
