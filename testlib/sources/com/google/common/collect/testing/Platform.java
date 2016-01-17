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
package com.google.common.collect.testing;

import java.util.Locale;

import com.google.common.annotations.GwtCompatible;

/**
 * Methods factored out so that they can be emulated differently in GWT.
 *
 * <p>This class is emulated in GWT.
 *
 * @author Hayward Chan
 */
@GwtCompatible
final class Platform {

	/**
	 * Calls {@link Class#isInstance(Object)}.  Factored out so that it can be
	 * emulated in GWT.
	 *
	 * <p>This method always returns {@code true} in GWT.
	 */
	static boolean checkIsInstance(Class<?> clazz, Object obj) {
		return clazz.isInstance(obj);
	}

	static <T> T[] clone(T[] array) {
		return array.clone();
	}

	// Class.cast is not supported in GWT.  This method is a no-op in GWT.
	static void checkCast(Class<?> clazz, Object obj) {
		clazz.cast(obj);
	}

	static String format(String template, Object... args) {
		return String.format(Locale.ROOT, template, args);
	}

	private Platform() {}
}