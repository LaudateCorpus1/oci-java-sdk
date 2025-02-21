/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL execution plan Performance statistics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlPlanInsightAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlPlanInsightAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Double ioTimeInSec;

        public Builder ioTimeInSec(Double ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
        private Double cpuTimeInSec;

        public Builder cpuTimeInSec(Double cpuTimeInSec) {
            this.cpuTimeInSec = cpuTimeInSec;
            this.__explicitlySet__.add("cpuTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
        private Double inefficientWaitTimeInSec;

        public Builder inefficientWaitTimeInSec(Double inefficientWaitTimeInSec) {
            this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
            this.__explicitlySet__.add("inefficientWaitTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Long executionsCount;

        public Builder executionsCount(Long executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanInsightAggregation build() {
            SqlPlanInsightAggregation __instance__ =
                    new SqlPlanInsightAggregation(
                            planHash,
                            ioTimeInSec,
                            cpuTimeInSec,
                            inefficientWaitTimeInSec,
                            executionsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanInsightAggregation o) {
            Builder copiedBuilder =
                    planHash(o.getPlanHash())
                            .ioTimeInSec(o.getIoTimeInSec())
                            .cpuTimeInSec(o.getCpuTimeInSec())
                            .inefficientWaitTimeInSec(o.getInefficientWaitTimeInSec())
                            .executionsCount(o.getExecutionsCount());

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
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    Long planHash;

    /**
     * IO Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    Double ioTimeInSec;

    /**
     * CPU Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    Double cpuTimeInSec;

    /**
     * Inefficient Wait Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
    Double inefficientWaitTimeInSec;

    /**
     * Total number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    Long executionsCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
