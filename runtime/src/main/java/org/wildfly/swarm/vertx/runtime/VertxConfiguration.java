/**
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.vertx.runtime;

import org.wildfly.swarm.resource.adapters.RARArchive;
import org.wildfly.swarm.spi.runtime.AbstractServerConfiguration;
import org.wildfly.swarm.vertx.VertxFraction;

/**
 * @author George Gastaldi
 */
public class VertxConfiguration extends AbstractServerConfiguration<VertxFraction> {

    public VertxConfiguration() {
        super(VertxFraction.class);
        deployment("org.wildfly.swarm:vertx-jca-adapter:rar:1.0.0-SNAPSHOT");
    }

    @Override
    public VertxFraction defaultFraction() {
        return new VertxFraction();
    }
}
