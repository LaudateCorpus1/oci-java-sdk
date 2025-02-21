/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Job phase status details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PhaseStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PhaseStatus {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private OdmsJobPhases name;

        public Builder name(OdmsJobPhases name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobPhaseStatus status;

        public Builder status(JobPhaseStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
        private Integer durationInMs;

        public Builder durationInMs(Integer durationInMs) {
            this.durationInMs = durationInMs;
            this.__explicitlySet__.add("durationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
        private Boolean isAdvisorReportAvailable;

        public Builder isAdvisorReportAvailable(Boolean isAdvisorReportAvailable) {
            this.isAdvisorReportAvailable = isAdvisorReportAvailable;
            this.__explicitlySet__.add("isAdvisorReportAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private java.util.List<PhaseExtractEntry> extract;

        public Builder extract(java.util.List<PhaseExtractEntry> extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private LogLocationBucketDetails logLocation;

        public Builder logLocation(LogLocationBucketDetails logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private Integer progress;

        public Builder progress(Integer progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseStatus build() {
            PhaseStatus __instance__ =
                    new PhaseStatus(
                            name,
                            status,
                            durationInMs,
                            isAdvisorReportAvailable,
                            extract,
                            logLocation,
                            progress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseStatus o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .durationInMs(o.getDurationInMs())
                            .isAdvisorReportAvailable(o.getIsAdvisorReportAvailable())
                            .extract(o.getExtract())
                            .logLocation(o.getLogLocation())
                            .progress(o.getProgress());

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
     * Phase name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    OdmsJobPhases name;

    /**
     * Phase status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    JobPhaseStatus status;

    /**
     * Duration of the phase in milliseconds
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
    Integer durationInMs;

    /**
     * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
    Boolean isAdvisorReportAvailable;

    /**
     * Summary of phase status results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    java.util.List<PhaseExtractEntry> extract;

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    LogLocationBucketDetails logLocation;

    /**
     * Percent progress of job phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    Integer progress;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
