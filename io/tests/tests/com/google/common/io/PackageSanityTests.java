/*
 * Original Guava code is copyright (C) 2015 The Guava Authors.
 * Modifications from Guava are copyright (C) 2015 DiffPlug.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.common.io;

import java.lang.reflect.Method;
import java.nio.channels.FileChannel.MapMode;

import com.google.common.testing.AbstractPackageSanityTests;

/**
 * Basic sanity tests for the entire package.
 *
 * @author Ben Yu
 */

public class PackageSanityTests extends AbstractPackageSanityTests {
	public PackageSanityTests() {
		setDefault(BaseEncoding.class, BaseEncoding.base64());
		setDefault(int.class, 32);
		setDefault(String.class, "abcd");
		setDefault(Method.class, AbstractPackageSanityTests.class.getDeclaredMethods()[0]);
		setDefault(MapMode.class, MapMode.READ_ONLY);
	}
}