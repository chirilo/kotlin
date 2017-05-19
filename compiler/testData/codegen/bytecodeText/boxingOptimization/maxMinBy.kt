// WITH_RUNTIME
// FILE: list.kt
val intList = listOf(1, 2, 3)
val longList = listOf(1L, 2L, 3L)

// FILE: box.kt
fun box(): String {
    val intListMin = intList.minBy { it } ?: -1
    if (intListMin != 1) return "Fail intListMin=$intListMin"

    val intListMax = intList.maxBy { it } ?: -1
    if (intListMax != 3) return "Fail intListMax=$intListMax"

    val longListMin = longList.minBy { it } ?: -1
    if (longListMin != 1L) return "Fail longListMin=$longListMin"

    val longListMax = longList.maxBy { it } ?: -1
    if (longListMax != 3L) return "Fail longListMax=$longListMax"

    return "OK"
}

// @BoxKt.class:
// 0 valueOf
// 0 compareTo