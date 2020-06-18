package androidx.compose.plugins.kotlin

import org.jetbrains.kotlin.name.Name

object KtxNameConventions {
    val COMPOSER = Name.identifier("composer")
    val COMPOSER_PARAMETER = Name.identifier("\$composer")
    val KEY_PARAMETER = Name.identifier("\$key")
    val CHANGED_PARAMETER = Name.identifier("\$changed")
    val DEFAULT_PARAMETER = Name.identifier("\$default")
    val JOINKEY = Name.identifier("joinKey")
    val STARTRESTARTGROUP = Name.identifier("startRestartGroup")
    val ENDRESTARTGROUP = Name.identifier("endRestartGroup")
    val UPDATE_SCOPE = Name.identifier("updateScope")
}