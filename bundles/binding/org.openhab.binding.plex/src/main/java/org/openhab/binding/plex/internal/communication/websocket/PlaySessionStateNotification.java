/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.plex.internal.communication.websocket;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.openhab.binding.plex.internal.communication.SessionUpdate;

/**
 * Part of the {@link NotificationContainer} object
 *
 * @author Jeroen Idserda
 * @since 1.9.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaySessionStateNotification implements SessionUpdate {

    private String key;

    private String sessionKey;

    private String state;

    private Integer viewOffset;

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    @Override
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Integer getViewOffset() {
        return viewOffset;
    }

    public void setViewOffset(Integer viewOffset) {
        this.viewOffset = viewOffset;
    }

}
