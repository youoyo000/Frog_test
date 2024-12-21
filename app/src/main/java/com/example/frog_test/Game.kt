package com.example.frog_test

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
class Game(val scope: CoroutineScope, val screenW:Int, val screenH: Int, scale:Float) {
    var counter = 200
    val state = MutableStateFlow(200)
    val background = Background(screenW)
    val frog = Frog(screenH, scale)
    var isPlaying = true
    //val frog = Frog(screenH, scale)


    fun Play(){
        scope.launch {
            //counter = 200
            isPlaying = true
            while (isPlaying) {
                delay(500)
                background.Roll()
                if (counter % 4 == 0){
                    frog.fly()
                }

                counter--
                state.emit(counter)

            }
        }
    }
    fun Restart(){
        // Virus.Reset()
        counter = 200
        isPlaying = true
        Play()
    }
}
