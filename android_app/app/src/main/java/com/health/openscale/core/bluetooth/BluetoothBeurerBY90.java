/* Copyright (C) 2023  olie.xdev <olie.xdev@googlemail.com>
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

 /*
 * Based on source-code by weliem/blessed-android
 */
package com.health.openscale.core.bluetooth;

import android.content.Context;

public class BluetoothBeurerBY90 extends BluetoothStandardWeightProfile {

    public BluetoothBeurerBY90(Context context) {
        super(context);
    }

    @Override
    public String driverName() {
        return "Beurer BY90";
    }

    @Override
    protected int getVendorSpecificMaxUserCount() {
        return 1;
    }

    @Override
    protected void setNotifyVendorSpecificUserList() {

    }

    @Override
    protected void requestVendorSpecificUserList() {

    }
}
