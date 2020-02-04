package xerus.todo

interface Item {
    val name: String
        get() = attributes.getValue("name")
    val id: String
        get() = attributes.getOrElse("id") { name }
    val attributes: Map<String, String>
}

interface Todo : Item {
    val tags: Collection<String>
        get() = attributes["tags"]?.split(';') ?: emptyList()
}

