package org.AlerHughes.Model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Artifact(
        @SerialName("name") val name: String,) {
    override fun toString(): String {
        return name
    }
}

val defaultArtifact: Artifact = Artifact("仲夏庭园")