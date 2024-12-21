package com.example.frog_test


class Frog(screenH:Int, scale:Float) {
    var w = (100 * scale).toInt()  //小男孩寬度
    var h = (310 * scale).toInt()  //小男孩高度
    var x = 265  //小男孩x軸座標
    var y = screenH - h  //小男孩y軸座標
    var pictNo = 0  //切換圖片

    fun fly() {
        pictNo++
        if (pictNo > 2) {
            pictNo = 0
        }
    }
}

