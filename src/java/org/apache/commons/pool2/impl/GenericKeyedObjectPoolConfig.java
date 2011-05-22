/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.pool2.impl;

/**
 * A simple "struct" encapsulating the configuration for a
 * {@link GenericKeyedObjectPool} excluding the factory used to create objects.
 * 
 * @since Pool 2.0
 */
public class GenericKeyedObjectPoolConfig extends GenericObjectPoolConfig {

    public static final int MAX_TOTAL_PER_KEY = 8;

    public static final int MAX_TOTAL = -1;

    
    private int maxTotalPerKey = MAX_TOTAL_PER_KEY;
    

    public GenericKeyedObjectPoolConfig() {
        // Uses a different default for maxTotal
        setMaxTotal(MAX_TOTAL);
    }
    
    
    public int getMaxTotalPerKey() {
        return maxTotalPerKey;
    }

    public void setMaxTotalPerKey(int maxTotalPerKey) {
        this.maxTotalPerKey = maxTotalPerKey;
    }
}
