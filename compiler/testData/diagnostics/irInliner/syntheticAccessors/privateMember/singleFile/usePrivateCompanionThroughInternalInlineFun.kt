// ISSUE: KT-71416
// FIR_IDENTICAL
// DIAGNOSTICS: -NOTHING_TO_INLINE

class A {
    private companion object {
        fun foo() = "OK"
    }

    private inline fun privateFun() = <!IR_PRIVATE_TYPE_USED_IN_NON_PRIVATE_INLINE_FUNCTION_WARNING!>foo()<!>
    internal inline fun internalInlineFun() = privateFun()
}

fun box(): String {
    return A().internalInlineFun()
}
