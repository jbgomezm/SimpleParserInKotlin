fun main(args: Array<String>) {
    if (args.isNotEmpty())  for (param in args)  consume(param)
    else println("""[E] No parameters were given.""")
    return
}

fun consume(param: String) {
    println("""Parameter $param consumed.""")
}
