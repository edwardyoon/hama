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
package org.apache.hama.bsp;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.zookeeper.KeeperException;

/**
 * This class provides an abstract implementation of the BSP interface.
 */
public abstract class BSP implements BSPInterface {

  protected Configuration conf;

  /**
   * This method is called before the BSP method. It can be used for setup
   * purposes.
   * 
   * @param peer Your BSPPeer instance.
   */
  public void setup(BSPPeer peer) {

  }

  /**
   * This method is called after the BSP method. It can be used for cleanup
   * purposes. Cleanup is guranteed to be called after the BSP runs, even in
   * case of exceptions.
   * 
   * @param peer Your BSPPeer instance.
   */
  public void cleanup(BSPPeer peer) {

  }

  /**
   * This method is your computation method, the main work of your BSP should be
   * done here.
   * 
   * @param peer Your BSPPeer instance.
   */
  @Override
  public void bsp(BSPPeer bspPeer) throws IOException, KeeperException,
      InterruptedException {

  }

  /**
   * Returns the configuration of this BSP Job.
   * 
   * @deprecated Use BSPPeer.getConfiguration() instead. Will be removed in
   *             0.5.0.
   */
  @Deprecated
  @Override
  public Configuration getConf() {
    return conf;
  }

  /**
   * Sets the configuration of this BSP Job.
   * 
   * @deprecated Won't be used anymore.
   */
  @Deprecated
  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
  }

}
