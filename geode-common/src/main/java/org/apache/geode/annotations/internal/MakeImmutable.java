/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.geode.annotations.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotates a field that should be made explicitly immutable.
 *
 * This is a field that we never actually modify, but it's value is a class that could
 * potentially accidentally be modified, such as an array, or a mutable collection (eg, HashMap).
 *
 * Consider wrapping the value in Collections.unmodifiableXXX, or turning an array into
 * an unmodifiable list.
 */
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface MakeImmutable {

  /** Optional description */
  String value() default "";
}
