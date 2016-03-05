/*
 * Original Guava code is copyright (C) 2015 The Guava Authors.
 * Modifications from Guava are copyright (C) 2016 DiffPlug.
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
package com.diffplug.common.collect.testing.google;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.diffplug.common.annotations.GwtCompatible;
import com.diffplug.common.collect.ListMultimap;
import com.diffplug.common.collect.testing.Helpers;
import com.diffplug.common.collect.testing.SampleElements;

/**
 * A skeleton generator for a {@code ListMultimap} implementation.
 *
 * @author Louis Wasserman
 */
@GwtCompatible
public abstract class TestStringListMultimapGenerator
		implements TestListMultimapGenerator<String, String> {

	@Override
	public SampleElements<Map.Entry<String, String>> samples() {
		return new SampleElements<Map.Entry<String, String>>(
				Helpers.mapEntry("one", "January"),
				Helpers.mapEntry("two", "February"),
				Helpers.mapEntry("three", "March"),
				Helpers.mapEntry("four", "April"),
				Helpers.mapEntry("five", "May"));
	}

	@Override
	public SampleElements<String> sampleKeys() {
		return new SampleElements<String>("one", "two", "three", "four", "five");
	}

	@Override
	public SampleElements<String> sampleValues() {
		return new SampleElements<String>("January", "February", "March", "April", "May");
	}

	@Override
	public Collection<String> createCollection(Iterable<? extends String> values) {
		return Helpers.copyToList(values);
	}

	@Override
	public final ListMultimap<String, String> create(Object... entries) {
		@SuppressWarnings("unchecked")
		Entry<String, String>[] array = new Entry[entries.length];
		int i = 0;
		for (Object o : entries) {
			@SuppressWarnings("unchecked")
			Entry<String, String> e = (Entry<String, String>) o;
			array[i++] = e;
		}
		return create(array);
	}

	protected abstract ListMultimap<String, String> create(
			Entry<String, String>[] entries);

	@Override
	@SuppressWarnings("unchecked")
	public final Entry<String, String>[] createArray(int length) {
		return new Entry[length];
	}

	@Override
	public final String[] createKeyArray(int length) {
		return new String[length];
	}

	@Override
	public final String[] createValueArray(int length) {
		return new String[length];
	}

	/** Returns the original element list, unchanged. */
	@Override
	public Iterable<Entry<String, String>> order(
			List<Entry<String, String>> insertionOrder) {
		return insertionOrder;
	}
}