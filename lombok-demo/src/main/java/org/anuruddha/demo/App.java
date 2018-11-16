package org.anuruddha.demo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        API myAPI = API.builder()
                .backend("mock-backend")
                .context("/")
                .global(false)
                .definition(APIDefinition.builder()
                        .method("POST")
                        .path("/")
                        .build())
                .definition(APIDefinition.builder()
                        .method("GET")
                        .path("version")
                        .build())
                .build();
    }
}
