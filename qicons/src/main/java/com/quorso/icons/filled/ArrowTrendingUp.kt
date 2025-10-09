package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowTrendingUp: ImageVector
    get() {
        if (_ArrowTrendingUp != null) {
            return _ArrowTrendingUp!!
        }
        _ArrowTrendingUp = ImageVector.Builder(
            name = "Filled.ArrowTrendingUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.22f, 6.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.968f, -0.431f)
                lineToRelative(5.942f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.431f, 0.97f)
                lineToRelative(-2.28f, 5.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.4f, -0.537f)
                lineToRelative(1.63f, -4.251f)
                lineToRelative(-1.086f, 0.484f)
                arcToRelative(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.45f, 5.173f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.199f, 0.19f)
                lineTo(9f, 12.312f)
                lineToRelative(-6.22f, 6.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.061f)
                lineToRelative(6.75f, -6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(3.606f, 3.606f)
                arcToRelative(12.695f, 12.695f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.68f, -4.974f)
                lineToRelative(1.086f, -0.483f)
                lineToRelative(-4.251f, -1.632f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.432f, -0.97f)
                close()
            }
        }.build()

        return _ArrowTrendingUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingUp: ImageVector? = null
