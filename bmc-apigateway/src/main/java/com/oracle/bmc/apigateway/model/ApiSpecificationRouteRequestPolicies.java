/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Behavior applied to any requests received by the API on this route.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRouteRequestPolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApiSpecificationRouteRequestPolicies {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("authorization")
        private RouteAuthorizationPolicy authorization;

        public Builder authorization(RouteAuthorizationPolicy authorization) {
            this.authorization = authorization;
            this.__explicitlySet__.add("authorization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cors")
        private CorsPolicy cors;

        public Builder cors(CorsPolicy cors) {
            this.cors = cors;
            this.__explicitlySet__.add("cors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryParameterValidations")
        private QueryParameterValidationRequestPolicy queryParameterValidations;

        public Builder queryParameterValidations(
                QueryParameterValidationRequestPolicy queryParameterValidations) {
            this.queryParameterValidations = queryParameterValidations;
            this.__explicitlySet__.add("queryParameterValidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerValidations")
        private HeaderValidationRequestPolicy headerValidations;

        public Builder headerValidations(HeaderValidationRequestPolicy headerValidations) {
            this.headerValidations = headerValidations;
            this.__explicitlySet__.add("headerValidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bodyValidation")
        private BodyValidationRequestPolicy bodyValidation;

        public Builder bodyValidation(BodyValidationRequestPolicy bodyValidation) {
            this.bodyValidation = bodyValidation;
            this.__explicitlySet__.add("bodyValidation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
        private HeaderTransformationPolicy headerTransformations;

        public Builder headerTransformations(HeaderTransformationPolicy headerTransformations) {
            this.headerTransformations = headerTransformations;
            this.__explicitlySet__.add("headerTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryParameterTransformations")
        private QueryParameterTransformationPolicy queryParameterTransformations;

        public Builder queryParameterTransformations(
                QueryParameterTransformationPolicy queryParameterTransformations) {
            this.queryParameterTransformations = queryParameterTransformations;
            this.__explicitlySet__.add("queryParameterTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheLookup")
        private ResponseCacheLookupPolicy responseCacheLookup;

        public Builder responseCacheLookup(ResponseCacheLookupPolicy responseCacheLookup) {
            this.responseCacheLookup = responseCacheLookup;
            this.__explicitlySet__.add("responseCacheLookup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRouteRequestPolicies build() {
            ApiSpecificationRouteRequestPolicies __instance__ =
                    new ApiSpecificationRouteRequestPolicies(
                            authorization,
                            cors,
                            queryParameterValidations,
                            headerValidations,
                            bodyValidation,
                            headerTransformations,
                            queryParameterTransformations,
                            responseCacheLookup);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRouteRequestPolicies o) {
            Builder copiedBuilder =
                    authorization(o.getAuthorization())
                            .cors(o.getCors())
                            .queryParameterValidations(o.getQueryParameterValidations())
                            .headerValidations(o.getHeaderValidations())
                            .bodyValidation(o.getBodyValidation())
                            .headerTransformations(o.getHeaderTransformations())
                            .queryParameterTransformations(o.getQueryParameterTransformations())
                            .responseCacheLookup(o.getResponseCacheLookup());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authorization")
    RouteAuthorizationPolicy authorization;

    @com.fasterxml.jackson.annotation.JsonProperty("cors")
    CorsPolicy cors;

    @com.fasterxml.jackson.annotation.JsonProperty("queryParameterValidations")
    QueryParameterValidationRequestPolicy queryParameterValidations;

    @com.fasterxml.jackson.annotation.JsonProperty("headerValidations")
    HeaderValidationRequestPolicy headerValidations;

    @com.fasterxml.jackson.annotation.JsonProperty("bodyValidation")
    BodyValidationRequestPolicy bodyValidation;

    @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
    HeaderTransformationPolicy headerTransformations;

    @com.fasterxml.jackson.annotation.JsonProperty("queryParameterTransformations")
    QueryParameterTransformationPolicy queryParameterTransformations;

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheLookup")
    ResponseCacheLookupPolicy responseCacheLookup;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
