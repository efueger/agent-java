/*
 * Copyright 2018 Continuous Performance Test
 * 
 * 
 * This file is part of Continuous Performance Test. https://github.com/continuous-perf-test/agent-java
 * 
 * Report Portal is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with Report Portal. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package com.perf.test.entity.dto;

import com.perf.test.entity.domain.Environment;
import com.perf.test.entity.domain.Perfomance;

/**
 * @author Aleh Struneuski
 */
public class PerfomanceMetric {

  private Environment environment;
  private Perfomance perfomance;

  public PerfomanceMetric(Environment environment, Perfomance perfomance) {
    this.environment = environment;
    this.perfomance = perfomance;
  }

  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  public Perfomance getPerfomance() {
    return perfomance;
  }

  public void setPerfomance(Perfomance perfomance) {
    this.perfomance = perfomance;
  }
}
