package org.AlerHughes.Command

import net.mamoe.mirai.console.command.CommandSender
import net.mamoe.mirai.console.command.SimpleCommand
import net.mamoe.mirai.message.data.PlainText
import net.mamoe.mirai.message.data.At
import org.AlerHughes.GetInfoByDivinatorySymbol
import org.AlerHughes.GetRandomDivinatorySymbol
import org.AlerHughes.Model.Artifact
import org.AlerHughes.PluginVoodoo

object TarotCommand : SimpleCommand(
        PluginVoodoo, "vdArtifact",
        description = "今日体力"
){
    @Handler
    suspend fun CommandSender.handle() {
        val artifact: Artifact = GetRandomArtifact()
        val name: String = GetInfoByArtifact(artifact)

        sendMessage(At(user!!) + PlainText("\n" + name))
    }
}