/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding count value.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityScoreAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecurityScoreAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
        private SecurityRating securityRating;

        public Builder securityRating(SecurityRating securityRating) {
            this.securityRating = securityRating;
            this.__explicitlySet__.add("securityRating");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
        private Integer securityScore;

        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            this.__explicitlySet__.add("securityScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityScoreAggregation build() {
            SecurityScoreAggregation __instance__ =
                    new SecurityScoreAggregation(dimensionsMap, securityRating, securityScore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityScoreAggregation o) {
            Builder copiedBuilder =
                    dimensionsMap(o.getDimensionsMap())
                            .securityRating(o.getSecurityRating())
                            .securityScore(o.getSecurityScore());

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

    /**
     * The key-value pairs of dimensions and their names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    java.util.Map<String, String> dimensionsMap;

    /**
     * The security rating with given dimension/s
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
    SecurityRating securityRating;

    /**
     * The security score with given dimension/s
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
    Integer securityScore;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
