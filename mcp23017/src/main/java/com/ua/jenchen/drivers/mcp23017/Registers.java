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

/* package */ interface Registers {

    /**
     * Returns address of direction register
     *
     * @return address of register
     */
    int getIODIR();

    /**
     * Returns address of input polarity port register
     *
     * @return address of register
     */
    int getIPOL();

    /**
     * Returns address of interrupt-on-change pins register
     *
     * @return address of register
     */
    int getGRIPTEN();

    /**
     * Returns address of default value register
     *
     * @return address of register
     */
    int getDEFVAL();

    /**
     * Returns address of interrupt-on-change control register
     *
     * @return address of register
     */
    int getINTCON();

    /**
     * Returns address of GPIO pull-up resistor register
     *
     * @return address of register
     */
    int getGPPU();

    /**
     * Returns address of interrupt flag register
     *
     * @return address of register
     */
    int getINTF();

    /**
     * Returns address of general purpose I/O port register
     *
     * @return address of register
     */
    int getGPIO();
}
