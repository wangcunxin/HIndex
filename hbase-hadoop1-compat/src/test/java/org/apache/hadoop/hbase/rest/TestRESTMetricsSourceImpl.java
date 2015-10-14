/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.rest;

import org.apache.hadoop.hbase.CompatibilitySingletonFactory;
import org.apache.hadoop.hbase.rest.MetricsRESTSource;
import org.apache.hadoop.hbase.rest.MetricsRESTSourceImpl;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *  Test for hadoop1's version of MetricsRESTSource
 */
public class TestRESTMetricsSourceImpl {

  @Test
  public void ensureCompatRegistered() throws Exception {
    assertNotNull(CompatibilitySingletonFactory.getInstance(MetricsRESTSource.class));
    assertTrue(CompatibilitySingletonFactory.getInstance(MetricsRESTSource.class) instanceof MetricsRESTSourceImpl);
  }

}
