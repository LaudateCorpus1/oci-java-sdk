/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.circuitbreaker.NoCircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircuitBreakerUtils {

    @Setter @Getter
    private static volatile CircuitBreakerConfiguration defaultCircuitBreakerConfiguration;

    public static CircuitBreakerConfiguration getNoCircuitBreakerConfiguration() {
        return new NoCircuitBreakerConfiguration();
    }

    /**
     * Get default CircuitBreakerConfiguration
     * @return the default CircuitBreakerConfiguration
     */
    public static CircuitBreakerConfiguration getDefaultCircuitBreakerConfig() {
        return defaultCircuitBreakerConfiguration;
    }

    public static final JaxRsCircuitBreaker DEFAULT_CIRCUIT_BREAKER =
            new JaxRsCircuitBreakerImpl(CircuitBreakerConfiguration.builder().build());
    public static final CircuitBreakerConfiguration DEFAULT_CIRCUIT_BREAKER_CONFIGURATION =
            CircuitBreakerConfiguration.builder().build();
    private static final String OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED_ENV_VAR =
            "OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED";

    public static CircuitBreakerConfiguration getUserDefinedCircuitBreakerConfiguration(
            ClientConfiguration configuration) {
        CircuitBreakerConfiguration circuitBreakerConfiguration = null;
        if (configuration != null) {
            if (configuration.getCircuitBreakerConfiguration() != null
                    && configuration.getCircuitBreaker() != null) {
                throw new IllegalArgumentException(
                        "Invalid CircuitBreaker setting. Please provide either CircuitBreaker configuration or CircuitBreaker and not both");
            }

            if (configuration.getCircuitBreakerConfiguration() != null) {
                circuitBreakerConfiguration = configuration.getCircuitBreakerConfiguration();
            }
        } else if (defaultCircuitBreakerConfiguration != null) {
            circuitBreakerConfiguration = defaultCircuitBreakerConfiguration;
        } else if (isEnvBasedDefaultCircuitBreakerEnabled()) {
            circuitBreakerConfiguration = DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        } else if (!isEnvBasedDefaultCircuitBreakerEnabled()) {
            circuitBreakerConfiguration = getNoCircuitBreakerConfiguration();
        }
        LOG.debug("Circuit breaker configuration in use: {}", circuitBreakerConfiguration);
        return circuitBreakerConfiguration;
    }

    private static boolean isEnvBasedDefaultCircuitBreakerEnabled() {
        final String defaultCircuitBreakerEnvVariable =
                System.getenv(OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED_ENV_VAR);
        if (defaultCircuitBreakerEnvVariable != null
                && defaultCircuitBreakerEnvVariable.equalsIgnoreCase("false")) {
            return false;
        }
        return true;
    }
}
