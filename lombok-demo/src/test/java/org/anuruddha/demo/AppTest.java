package org.anuruddha.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testBuilder() {
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
                        .path("/version")
                        .build())
                .build();

        Assert.assertEquals("mock-backend", myAPI.getBackend());
        Assert.assertEquals("/", myAPI.getContext());
        Assert.assertFalse(myAPI.isGlobal());
        Assert.assertEquals(myAPI.definitions.size(), 2);
        Assert.assertEquals("POST", myAPI.definitions.get(0).getMethod());
        Assert.assertEquals("/", myAPI.definitions.get(0).getPath());
        Assert.assertEquals("GET", myAPI.definitions.get(1).getMethod());
        Assert.assertEquals("/version", myAPI.definitions.get(1).getPath());
    }
}
