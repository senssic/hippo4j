/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.common.model;

/**
 * Pool parameter.
 *
 * @author chen.ma
 * @date 2021/6/24 16:04
 */
public interface PoolParameter {

    /**
     * tenantId
     *
     * @return
     */
    String getTenantId();

    /**
     * itemId
     *
     * @return
     */
    String getItemId();

    /**
     * tpId
     *
     * @return
     */
    String getTpId();

    /**
     * coreSize
     *
     * @return
     */
    Integer getCoreSize();

    /**
     * maxSize
     *
     * @return
     */
    Integer getMaxSize();

    /**
     * queueType
     *
     * @return
     */
    Integer getQueueType();

    /**
     * capacity
     *
     * @return
     */
    Integer getCapacity();

    /**
     * keepAliveTime
     *
     * @return
     */
    Integer getKeepAliveTime();

    /**
     * rejectedType
     *
     * @return
     */
    Integer getRejectedType();

    /**
     * isAlarm
     *
     * @return
     */
    Integer getIsAlarm();

    /**
     * capacityAlarm
     *
     * @return
     */
    Integer getCapacityAlarm();

    /**
     * livenessAlarm
     *
     * @return
     */
    Integer getLivenessAlarm();

    /**
     * allowCoreThreadTimeOut
     *
     * @return
     */
    Integer getAllowCoreThreadTimeOut();
}
