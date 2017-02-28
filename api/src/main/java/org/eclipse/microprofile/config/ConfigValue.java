/*
 * Copyright (c) 2017 Payara Services Ltd., IBM Corp. and others
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
 *
 */
package org.eclipse.microprofile.config;

/**
 * Accessor to a configured value {@link #getValue()}, this is to be used for property injection.
 * e.g. @Inject @ConfigProperty("myProp") ConfigValue<String> myValue;
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 * @author <a href="mailto:gpetracek@apache.org">Gerhard Petracek</a>
 * @author <a href="mailto:rsmeral@jboss.org">Ron Smeral</a>
 * @author Ondrej Mihalyi
 * @author <a href="mailto:emijiang@uk.ibm.com">Emily Jiang</a>
 * 
 * @param <T> Type of the configuration value
 */

import java.util.Optional;

import org.eclipse.microprofile.config.spi.ConfigSource;

public interface ConfigValue<T> {

    /**
     * Return the resolved property value with the specified type T for the
     * specified property name from the underlying {@link ConfigSource ConfigSources}.
     * @return the resolved property value
     */

    Optional<T> getValue();
}
