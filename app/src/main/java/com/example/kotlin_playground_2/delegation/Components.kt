package com.example.kotlin_playground_2.delegation



interface Downloader {
    fun download()
}

interface Player {
    fun play()
}

class FileDownloader(private val file: String): Downloader {
    override fun download() {
        println("$file is downloading ...")
    }
}

class FilePlayer(private val file: String): Player {
    override fun play() {
        println("$file is playing ...")
    }
}

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
): Downloader, Player {

    override fun download() {
        downloader.download()
    }

    override fun play() {
        player.play()
    }
}

//========= Using by-clause ==============
//========= Dynamic Delegation by-clause using Composition ==============

class MediaFileBy(
    private val downloader: Downloader,
    private val player: Player
): Downloader by downloader, Player by player

//=========== Static Delegation by-clause using Inheritance =============

class MediaFileDownLoader: Downloader by FileDownloader("file.xyz")

class MediaFilePlayer: Player by FilePlayer("file.xyz")



