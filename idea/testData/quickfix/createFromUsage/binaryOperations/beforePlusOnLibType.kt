// "Create function 'plus' from usage" "true"

class A<T>(val n: T)

fun test() {
    val a: A<Int> = 2 <caret>+ A(1)
}