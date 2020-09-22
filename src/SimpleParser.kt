fun main(args: Array<String>) {
    if (args.isNotEmpty())  for (param in args)  consume(param)
    else println("""[E] No parameters were given.""")
    return
}

fun consume(param: String) {
    val paramUCase = param.toUpperCase()
    if (paramUCase != param)
        println("""[W] ${param} is not in uppercase.""")
    println("""Parameter ${paramUCase} consumed.""")
}
