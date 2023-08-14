    package com.example.patronsinkotlin.Singleton

    class Singleton {

        var name: String = ""
        var version: Int = 0

        companion object {
            private var _singleton: Singleton? = null
            fun getInstance(): Singleton {
                if (_singleton == null) {
                    _singleton = Singleton()
                }
                //return _singleton!!
                return _singleton ?: Singleton()
            }
        }

        override fun toString(): String {
            return "Singleton(name='$name', version=$version)"
        }


    }
