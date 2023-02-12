package org.AlerHughes

import kotlinx.serialization.decodeFromString
import org.AlerHughes.Controller.CustomJson
import org.AlerHughes.Model.Artifact

typealias ArtifactTable = Map<Int, Artifact>

var ArtifactCache: ArtifactTable =  mapOf()

fun InitArtifact()
{
    ArtifactCache = CustomJson.decodeFromString(PluginVoodoo.dataFolder.resolve("ArtifactData/Artifact.json").readText())
}

fun GetRandomArtifact() : Artifact
{
    return ArtifactCache.values.random()
}

fun GetInfoByArtifact(artifact: Artifact) : String
{
    return """
        #${artifact.name}
        """.trimMargin("#")
}