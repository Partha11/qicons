package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.RocketLaunch: ImageVector
    get() {
        if (_RocketLaunch != null) {
            return _RocketLaunch!!
        }
        _RocketLaunch = ImageVector.Builder(
            name = "Filled.RocketLaunch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.315f, 7.584f)
                curveTo(12.195f, 3.883f, 16.695f, 1.5f, 21.75f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                curveToRelative(0f, 5.056f, -2.383f, 9.555f, -6.084f, 12.436f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 22.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-4.131f)
                arcTo(15.838f, 15.838f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.382f, 15f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.815f, -6.666f)
                close()
                moveTo(15f, 6.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.26f, 17.242f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.897f, -1.203f)
                arcToRelative(5.243f, 5.243f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.05f, 5.022f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.625f, 0.627f)
                arcToRelative(5.243f, 5.243f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.022f, -2.051f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.202f, -0.897f)
                arcToRelative(3.744f, 3.744f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.008f, 1.51f)
                curveToRelative(0f, -1.23f, 0.592f, -2.323f, 1.51f, -3.008f)
                close()
            }
        }.build()

        return _RocketLaunch!!
    }

@Suppress("ObjectPropertyName")
private var _RocketLaunch: ImageVector? = null
