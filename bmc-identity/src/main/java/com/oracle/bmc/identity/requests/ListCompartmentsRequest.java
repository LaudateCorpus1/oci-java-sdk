/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListCompartmentsExample.java.html">here</a> to see how to use ListCompartmentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListCompartmentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     */
    private String compartmentId;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     *
     */
    private Integer limit;

    /**
     * Valid values are `ANY` and `ACCESSIBLE`. Default is `ANY`.
     * Setting this to `ACCESSIBLE` returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). For the compartments on which the user indirectly has
     * INSPECT permissions, a restricted set of fields is returned.
     * <p>
     * When set to `ANY` permissions are not checked.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are `ANY` and `ACCESSIBLE`. Default is `ANY`.
     * Setting this to `ACCESSIBLE` returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). For the compartments on which the user indirectly has
     * INSPECT permissions, a restricted set of fields is returned.
     * <p>
     * When set to `ANY` permissions are not checked.
     *
     **/
    public enum AccessLevel {
        Any("ANY"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };
    /**
     * Default is false. Can only be set to true when performing
     * ListCompartments on the tenancy (root compartment).
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the the setting of `accessLevel`.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * A filter to only return resources that match the given name exactly.
     *
     */
    private String name;

    /**
     * The field to sort by. You can provide one sort order (`sortOrder`). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some \"List\" operations (for example, `ListInstances`) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these \"List\" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order (`sortOrder`). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some \"List\" operations (for example, `ListInstances`) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these \"List\" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Name("NAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`). The NAME sort order
     * is case sensitive.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`). The NAME sort order
     * is case sensitive.
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     *
     */
    private Compartment.LifecycleState lifecycleState;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCompartmentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListCompartmentsRequest o) {
            compartmentId(o.getCompartmentId());
            page(o.getPage());
            limit(o.getLimit());
            accessLevel(o.getAccessLevel());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            name(o.getName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCompartmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCompartmentsRequest
         */
        public ListCompartmentsRequest build() {
            ListCompartmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
