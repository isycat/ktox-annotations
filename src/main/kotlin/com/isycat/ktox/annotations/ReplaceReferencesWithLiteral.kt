package com.isycat.ktox.annotations

/**
 * Marks a property or function so that every reference to it in transpiled
 * output is replaced with the supplied string literal instead of the
 * Kotlin identifier.
 *
 * Example:
 * ```kotlin
 * @ReplaceReferencesWithLiteral("demo_stop")
 * val DEMO_STOP: EventKey = externalSource()
 * ```
 * Any reference to `DEMO_STOP` in transpiled Lua becomes the string
 * literal `"demo_stop"`, and the property declaration itself is omitted.
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
annotation class ReplaceReferencesWithLiteral(val value: String)
