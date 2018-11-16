package org.anuruddha.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class API {
    private String context;
    private String backend;
    List<APIDefinition> definitions;
    private boolean global;

    @java.beans.ConstructorProperties({"context", "backend", "definitions", "global"})
    API(String context, String backend, List<APIDefinition> definitions, boolean global) {
        this.context = context;
        this.backend = backend;
        this.definitions = definitions;
        this.global = global;
    }

    public static APIBuilder builder() {
        return new APIBuilder();
    }

    public String getContext() {
        return this.context;
    }

    public String getBackend() {
        return this.backend;
    }

    public List<APIDefinition> getDefinitions() {
        return this.definitions;
    }

    public boolean isGlobal() {
        return this.global;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public void setDefinitions(List<APIDefinition> definitions) {
        this.definitions = definitions;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof API)) return false;
        final API other = (API) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$context = this.getContext();
        final Object other$context = other.getContext();
        if (this$context == null ? other$context != null : !this$context.equals(other$context)) return false;
        final Object this$backend = this.getBackend();
        final Object other$backend = other.getBackend();
        if (this$backend == null ? other$backend != null : !this$backend.equals(other$backend)) return false;
        final Object this$definitions = this.getDefinitions();
        final Object other$definitions = other.getDefinitions();
        if (this$definitions == null ? other$definitions != null : !this$definitions.equals(other$definitions))
            return false;
        if (this.isGlobal() != other.isGlobal()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof API;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $context = this.getContext();
        result = result * PRIME + ($context == null ? 43 : $context.hashCode());
        final Object $backend = this.getBackend();
        result = result * PRIME + ($backend == null ? 43 : $backend.hashCode());
        final Object $definitions = this.getDefinitions();
        result = result * PRIME + ($definitions == null ? 43 : $definitions.hashCode());
        result = result * PRIME + (this.isGlobal() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "API(context=" + this.getContext() + ", backend=" + this.getBackend() + ", definitions=" + this.getDefinitions() + ", global=" + this.isGlobal() + ")";
    }

    public static class APIBuilder {
        private String context;
        private String backend;
        private ArrayList<APIDefinition> definitions;
        private boolean global;

        APIBuilder() {
        }

        public API.APIBuilder context(String context) {
            this.context = context;
            return this;
        }

        public API.APIBuilder backend(String backend) {
            this.backend = backend;
            return this;
        }

        public API.APIBuilder definition(APIDefinition definition) {
            if (this.definitions == null) this.definitions = new ArrayList<APIDefinition>();
            this.definitions.add(definition);
            return this;
        }

        public API.APIBuilder definitions(Collection<? extends APIDefinition> definitions) {
            if (this.definitions == null) this.definitions = new ArrayList<APIDefinition>();
            this.definitions.addAll(definitions);
            return this;
        }

        public API.APIBuilder clearDefinitions() {
            if (this.definitions != null)
                this.definitions.clear();

            return this;
        }

        public API.APIBuilder global(boolean global) {
            this.global = global;
            return this;
        }

        public API build() {
            List<APIDefinition> definitions;
            switch (this.definitions == null ? 0 : this.definitions.size()) {
                case 0:
                    definitions = java.util.Collections.emptyList();
                    break;
                case 1:
                    definitions = java.util.Collections.singletonList(this.definitions.get(0));
                    break;
                default:
                    definitions =
                            java.util.Collections.unmodifiableList(new ArrayList<APIDefinition>(this.definitions));
            }

            return new API(context, backend, definitions, global);
        }

        public String toString() {
            return "API.APIBuilder(context=" + this.context + ", backend=" + this.backend + ", definitions=" + this.definitions + ", global=" + this.global + ")";
        }
    }
}
