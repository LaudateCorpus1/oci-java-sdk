/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating the export set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateExportSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateExportSetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
        private Long maxFsStatBytes;

        public Builder maxFsStatBytes(Long maxFsStatBytes) {
            this.maxFsStatBytes = maxFsStatBytes;
            this.__explicitlySet__.add("maxFsStatBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
        private Long maxFsStatFiles;

        public Builder maxFsStatFiles(Long maxFsStatFiles) {
            this.maxFsStatFiles = maxFsStatFiles;
            this.__explicitlySet__.add("maxFsStatFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExportSetDetails build() {
            UpdateExportSetDetails __instance__ =
                    new UpdateExportSetDetails(displayName, maxFsStatBytes, maxFsStatFiles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExportSetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .maxFsStatBytes(o.getMaxFsStatBytes())
                            .maxFsStatFiles(o.getMaxFsStatFiles());

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
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My export set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tbytes} value reported by {@code FSSTAT} will be
     * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
     * {@code maxFsStatBytes} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatBytes},
     * then {@code fbytes} and {@code abytes} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
    Long maxFsStatBytes;

    /**
     * Controls the maximum {@code ffiles}, {@code ffiles}, and {@code afiles}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tfiles} value reported by {@code FSSTAT} will be
     * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
     * {@code maxFsStatFiles} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatFiles},
     * then {@code ffiles} and {@code afiles} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
    Long maxFsStatFiles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
