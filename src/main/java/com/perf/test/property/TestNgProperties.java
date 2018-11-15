/*
 * Copyright 2018 Continuous Performance Test
 * 
 * 
 * This file is part of Continuous Performance Test.
 * https://github.com/continuous-perf-test/agent-java
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

package com.perf.test.property;

import org.aeonbits.owner.Config;

/**
 * Receives TestNG settings
 * 
 * @author Aleh Struneuski
 */
public interface TestNgProperties extends Config {

  @Key("groups")
  @DefaultValue("None")
  String groups();

  @Key("threadCount")
  @DefaultValue("1")
  int threadCount();

  @Key("dataproviderthreadcount")
  @DefaultValue("1")
  int dataProviderThreadCount();

  @Key("parallel")
  @DefaultValue("None")
  String parallelMode();
}
