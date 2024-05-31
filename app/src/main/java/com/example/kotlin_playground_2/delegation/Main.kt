package com.example.kotlin_playground_2.delegation

fun main() {
    val file1 = "file1.kvm"
    val mediaFile = MediaFile(FileDownloader(file1), FilePlayer(file1))
    mediaFile.download()
    mediaFile.play()

    println("======================================")

    val file2 = "file2.abc"
    val mediaFileBy = MediaFile(FileDownloader(file2), FilePlayer(file2))
    mediaFileBy.download()
    mediaFileBy.play()

    println("======================================")

    val mediaFileDownloader = MediaFileDownLoader()
    mediaFileDownloader.download()
    val mediaFilePlayer = MediaFilePlayer()
    mediaFilePlayer.play()
}