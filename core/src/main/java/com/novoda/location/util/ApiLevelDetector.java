/**
 * Copyright 2011 Novoda Ltd.
 *
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
package com.novoda.location.util;

import android.os.Build;

public class ApiLevelDetector {

	private final boolean supportsGingerbread = Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
	private final boolean supportsFroyo = Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;

	public boolean supportsGingerbread() {
		return supportsGingerbread;
	}
	
	public boolean supportsFroyo() {
		return supportsFroyo;
	}
	
}
