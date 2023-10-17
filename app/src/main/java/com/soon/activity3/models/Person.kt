package com.soon.activity3.models

data class Person(
    val name: String,
    val subject: String,
    val content: String
) {
    val truncatedContent: String
        get() {
            val maxLength = 50 // Set the maximum length you want to display
            return if (content.length > maxLength) {
                content.substring(0, maxLength) + "..."
            } else {
                content
            }
        }
}
