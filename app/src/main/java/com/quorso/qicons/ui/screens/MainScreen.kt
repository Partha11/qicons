package com.quorso.qicons.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons
import com.quorso.icons.outlined.AcademicCap
import com.quorso.icons.outlined.Clock
import com.quorso.icons.outlined.PaperAirplane
import com.quorso.icons.outlined.Wallet

@Composable
fun MainScreen() {
    MainScreenContent()
}

@Composable
fun MainScreenContent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(4)
        ) {
            item {
                Icon(
                    imageVector = QIcons.Outlined.AcademicCap,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
            item {
                Icon(
                    imageVector = QIcons.Outlined.PaperAirplane,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
            item {
                Icon(
                    imageVector = QIcons.Outlined.Wallet,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
            item {
                Icon(
                    imageVector = QIcons.Outlined.Clock,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreenContent()
}