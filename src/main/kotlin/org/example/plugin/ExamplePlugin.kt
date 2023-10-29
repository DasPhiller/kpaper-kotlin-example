package org.example.plugin

import de.miraculixx.kpaper.main.KPaper
import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig

class ExamplePlugin : KPaper() {

    override fun startup() {
        //Startup
        CommandAPI.onLoad(CommandAPIBukkitConfig(this).silentLogs(true))
    }

}
