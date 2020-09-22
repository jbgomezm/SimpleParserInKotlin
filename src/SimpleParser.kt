fun main(args: Array<String>) {
    if (args.isNotEmpty())  for (param in args)  consume(param)
    else println("""[E] No parameters were given.""")
    return
}

fun consume(param: String) {
    val paramUCase = param.toUpperCase()
    if (paramUCase != param)
        println("""[W] ${param} is not in uppercase.""")
    if (isColor(paramUCase))
        println("""-> Color ${paramUCase} found.""")
    if (isAnimal(paramUCase))
        println("""-> Animal ${paramUCase} found.""")
}

fun isColor(param: String) : Boolean {
    val validColors = listOf("BLACK", "BLUE", "YELLOW", "RED",
        "GREEN", "WHITE")
    return validColors.contains(param)
}

fun isAnimal(param: String) : Boolean {
    val validAnimals = listOf("DOG", "CAT", "COW", "HORSE",
            "FISH", "CHICKEN")
    return validAnimals.contains(param)
}


