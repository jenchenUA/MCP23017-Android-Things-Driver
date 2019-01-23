/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ua.jenchen.drivers.mcp23017;

import com.google.android.things.pio.Gpio;

/* package */ interface MCP23017Pin extends Gpio, AutoCloseable {

    /**
     * Returns integer representation of address of pin in registers
     *
     * @return integer representation of address of pin in registers
     */
    int getAddress();

    /**
     * Return registers of current channel
     *
     * @return registers of current channel
     */
    Registers getRegisters();

    /**
     * Executes callback for interrupt-on-change events, which was registered to the pin
     */
    void executeCallbacks();
}
