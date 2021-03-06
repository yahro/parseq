/*
 * Copyright 2012 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.linkedin.parseq.promise;

/**
 * A {@link Promise} that can have its value set.
 *
 * @author Chris Pettitt (cpettitt@linkedin.com)
 */
public interface SettablePromise<P> extends Promise<P>
{
  /**
   * Sets the value for this promise to the given value.
   *
   * @param value the value to set on this promise.
   * @throws PromiseResolvedException if the promise already has a value set.
   */
  void done(P value) throws PromiseResolvedException;

  /**
   * Sets an error on this promise.
   *
   * @param error the error to set on this promise
   * @throws PromiseResolvedException if the promise already has a value set.
   */
  void fail(Throwable error) throws PromiseResolvedException;
}
