package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component

class ImageComponent(
    private val data: Data,
) : Component() {

    @Composable
    override fun Render() {
        super.Render()
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data.value)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(64.dp)
                .height(64.dp)
                .clip(CircleShape)
        )
    }
}