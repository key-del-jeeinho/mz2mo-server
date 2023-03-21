package com.emo_hip_hop.mz2mo.music.adapter.output.persistence

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "music_votes")
class MusicVoteJpaEntity(
    @Id
    var id: ObjectId,
    val musicArticleId: String,
    val accountId: String,
    val emojiId: String
)