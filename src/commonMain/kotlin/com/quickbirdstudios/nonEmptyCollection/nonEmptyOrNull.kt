@file:Suppress("unused")
@file:OptIn(UnsafeNonEmptyCollectionApi::class)

package com.quickbirdstudios.nonEmptyCollection

import com.quickbirdstudios.nonEmptyCollection.unsafe.UnsafeNonEmptyCollectionApi
import com.quickbirdstudios.nonEmptyCollection.unsafe.toNonEmptyList
import com.quickbirdstudios.nonEmptyCollection.unsafe.toNonEmptyMap
import com.quickbirdstudios.nonEmptyCollection.unsafe.toNonEmptySet

fun <T> List<T>.nonEmptyOrNull() = if (isEmpty()) null else toNonEmptyList()

fun <T> Set<T>.nonEmptyOrNull() = if (isEmpty()) null else toNonEmptySet()

fun <K, V> Map<K, V>.nonEmptyOrNull() = if (isEmpty()) null else toNonEmptyMap()
