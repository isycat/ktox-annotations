package com.isycat.ktox.annotations

/**
 * Annotation to preserve the original native function/property/enum name from the Dota 2 API.
 *
 * This annotation is used to mark generated properties, functions, and enum entries with their original
 * names from the Dota 2 API (VScripts Lua and Panorama JavaScript), allowing for proper mapping when
 * Kotlin naming conventions differ from the native API.
 *
 * Usage:
 * - For enum entries: `@NativeName("DOTA_DAMAGE_FLAG_IGNORES_MAGIC_ARMOR")`
 * - For properties: `@get:NativeName("GetHealth")` or `@set:NativeName("SetHealth")`
 * - For functions: `@NativeName("AddNewModifier")`
 */
@Target(
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.FIELD,
    AnnotationTarget.CLASS,
)
@Retention(AnnotationRetention.RUNTIME)
annotation class NativeName(val value: String)
