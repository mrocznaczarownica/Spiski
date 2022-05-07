package com.example.spiski.recadapters

import com.example.spiski.R

data class feel(val image:Int, val name_feel:String, val name2:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.img, name_feel = "", name2 = ""),
    feel(R.drawable.img, "Strana1", "Gorod1"),
    feel(R.drawable.img, "Strana2", "Gorod2"),
    feel(R.drawable.img, "Strana3", "Gorod3"),
    feel(R.drawable.img,"Strana4", "Gorod4"),
    feel(R.drawable.img, "Strana5", "Gorod5")
)}
