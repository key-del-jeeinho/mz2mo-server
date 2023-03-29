package com.emo_hip_hop.mz2mo.music.application.port.input

import com.emo_hip_hop.mz2mo.music.domain.MusicCommunity

interface RemoveMusicVoteUseCase {
    operator fun invoke(command: RemoveMusicVoteCommand): MusicCommunity
}