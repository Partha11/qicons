package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.BellSnooze: ImageVector
    get() {
        if (_BellSnooze != null) {
            return _BellSnooze!!
        }
        _BellSnooze = ImageVector.Builder(
            name = "Filled.BellSnooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2.25f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 9f)
                verticalLineToRelative(0.75f)
                arcToRelative(8.217f, 8.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.119f, 5.52f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.298f, 1.206f)
                curveToRelative(1.544f, 0.57f, 3.16f, 0.99f, 4.831f, 1.243f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.48f, 0f)
                arcToRelative(24.583f, 24.583f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.83f, -1.244f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.298f, -1.205f)
                arcToRelative(8.217f, 8.217f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.118f, -5.52f)
                lineTo(18.75f, 9f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
                close()
                moveTo(9.75f, 18f)
                curveToRelative(0f, -0.034f, 0f, -0.067f, 0.002f, -0.1f)
                arcToRelative(25.05f, 25.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.496f, 0f)
                lineToRelative(0.002f, 0.1f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, 0f)
                close()
                moveTo(10.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.599f)
                lineToRelative(-2.223f, 3.334f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 13.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.599f)
                lineToRelative(2.223f, -3.334f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()

        return _BellSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _BellSnooze: ImageVector? = null
