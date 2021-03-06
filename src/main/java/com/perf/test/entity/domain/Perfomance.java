/*
 * Copyright 2018 Continuous Performance Test
 * 
 * 
 * This file is part of Continuous Performance Test.
 * https://github.com/continuous-perf-test/agent-java
 * 
 * Continuous Performance Test is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 * 
 * Continuous Performance Test is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with Continuous
 * Performance Test. If not, see <http://www.gnu.org/licenses/>.
 */

package com.perf.test.entity.domain;

import java.util.Objects;

/**
 * @author Aleh Struneuski
 */
public class Perfomance {

  private RequestAttribute requestAttribute;
  private ResponseAttribute responseAttribute;
  private int executionTimeInMillis;

  public RequestAttribute getRequestAttribute() {
    return requestAttribute;
  }

  public void setRequestAttribute(RequestAttribute requestAttribute) {
    this.requestAttribute = requestAttribute;
  }

  public ResponseAttribute getResponseAttribute() {
    return responseAttribute;
  }

  public void setResponseAttribute(ResponseAttribute responseAttribute) {
    this.responseAttribute = responseAttribute;
  }

  public int getExecutionTimeInMillis() {
    return executionTimeInMillis;
  }

  public void setExecutionTimeInMillis(int executionTimeInMillis) {
    this.executionTimeInMillis = executionTimeInMillis;
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Perfomance)) {
      return false;
    }
    Perfomance castOther = (Perfomance) other;
    return Objects.equals(requestAttribute, castOther.requestAttribute)
        && Objects.equals(responseAttribute, castOther.responseAttribute)
        && Objects.equals(executionTimeInMillis, castOther.executionTimeInMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestAttribute, responseAttribute, executionTimeInMillis);
  }
}
