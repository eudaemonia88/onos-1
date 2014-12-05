/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.store.service;

/**
 * Status of completed write request.
 */
public enum WriteStatus {

    /**
     * Write completed successfully.
     */
    OK,

    /**
     * Write was aborted (ex: if one or more write operations in a batch fail, others are aborted).
     */
    ABORTED,

    /**
     * Write failed due to pre-condition failure. (ex: version or value mis-match).
     */
    PRECONDITION_VIOLATION,

    /**
     * Write failed due to an invalid table name being specified.
     */
    NO_SUCH_TABLE,
}
