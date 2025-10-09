package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTrendingUp: ImageVector
    get() {
        if (_ArrowTrendingUp != null) {
            return _ArrowTrendingUp!!
        }
        _ArrowTrendingUp = ImageVector.Builder(
            name = "Outlined.ArrowTrendingUp",
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
                moveTo(2.25f, 18f)
                lineTo(9f, 11.25f)
                lineToRelative(4.306f, 4.306f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.814f, -5.518f)
                lineToRelative(2.74f, -1.22f)
                moveToRelative(0f, 0f)
                lineToRelative(-5.94f, -2.281f)
                moveToRelative(5.94f, 2.28f)
                lineToRelative(-2.28f, 5.941f)
            }
        }.build()

        return _ArrowTrendingUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingUp: ImageVector? = null
