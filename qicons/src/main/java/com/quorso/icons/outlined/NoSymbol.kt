package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.NoSymbol: ImageVector
    get() {
        if (_NoSymbol != null) {
            return _NoSymbol!!
        }
        _NoSymbol = ImageVector.Builder(
            name = "Outlined.NoSymbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.364f, 18.364f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.636f, 5.636f)
                moveToRelative(12.728f, 12.728f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.636f, 5.636f)
                moveToRelative(12.728f, 12.728f)
                lineTo(5.636f, 5.636f)
            }
        }.build()

        return _NoSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _NoSymbol: ImageVector? = null
