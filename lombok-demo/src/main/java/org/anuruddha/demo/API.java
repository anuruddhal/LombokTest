package org.anuruddha.demo;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class API {
    private String context;
    private String backend;
    @Singular
    List<APIDefinition> definitions;
    private boolean global;
}
