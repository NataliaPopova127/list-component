package com.example.myapplication

class News {
    private var title // название
            : String? = null
    private var imageNews // ресурс флага
            = 0

   constructor(title: String?, image: Int) {
        this.title = title
        imageNews = image
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getImage(): Int {
        return imageNews
    }

    fun setImage(image: Int) {
        this.imageNews = image
    }
}