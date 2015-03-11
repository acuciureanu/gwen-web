/*
 * Copyright 2014-2015 Branko Juric, Brady Wood
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
 */

package gwen.web

import gwen.eval.GwenInterpreter
import gwen.eval.GwenApp

/**
  * The gwen-web interpreter.
  * 
  * @author Branko Juric, Brady Wood
  */
class GwenWebInterpreter extends GwenInterpreter[WebEnvContext] with GwenWebEngine

/**
  * The gwen-web standalone application.
  * 
  * @author Branko Juric, Brady Wood
  */
object GwenWebInterpreter extends GwenApp(new GwenWebInterpreter)
