// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.changfeng.common.App


private var time by mutableStateOf(System.nanoTime())
private var frame by mutableStateOf(0)
fun main() = application {
    if (frame == 0) {
        frame++
    } else if (frame == 1) {
        val duration = ((System.nanoTime() - time) / 1E6).toLong()
        println("First frame millis: $duration")
    }
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
