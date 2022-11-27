package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.SetView
import kotlinx.coroutines.flow.distinctUntilChanged

class VerticalListComponent(
    private val data: Data,
) : Component() {

    @Composable
    override fun Render() {
        super.Render()

        val lazyState = rememberLazyListState()

        val loadMore = remember {
            derivedStateOf {
                val layoutInfo = lazyState.layoutInfo
                val totalItemsNumber = layoutInfo.totalItemsCount
                val lastVisibleItemIndex =
                    (layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0) + 1

                lastVisibleItemIndex == totalItemsNumber
            }
        }

        LaunchedEffect(loadMore) {
            snapshotFlow { loadMore.value }
                .distinctUntilChanged()
                .collect {
                    if (it) {
                        emit("LAST ELEMENT")
                    }
                }
        }

        LazyColumn(
            state = lazyState,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
        ) {
            items(data.children) { item ->
                SetView(item)
                Divider()
            }
        }
    }
}