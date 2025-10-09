package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Variable: ImageVector
    get() {
        if (_Variable != null) {
            return _Variable!!
        }
        _Variable = ImageVector.Builder(
            name = "Filled.Variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.253f, 2.292f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.955f, 0.461f)
                arcTo(28.123f, 28.123f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                curveToRelative(0f, 3.266f, -0.547f, 6.388f, -1.542f, 9.247f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.416f, -0.494f)
                curveToRelative(0.94f, -2.7f, 1.458f, -5.654f, 1.458f, -8.753f)
                reflectiveCurveToRelative(-0.519f, -6.054f, -1.458f, -8.754f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.461f, -0.954f)
                close()
                moveTo(5.026f, 2.305f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.414f, 0.976f)
                arcTo(23.183f, 23.183f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 12f)
                curveToRelative(0f, 3.085f, 0.6f, 6.027f, 1.69f, 8.718f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.39f, 0.563f)
                curveToRelative(-1.161f, -2.867f, -1.8f, -6f, -1.8f, -9.281f)
                curveToRelative(0f, -3.28f, 0.639f, -6.414f, 1.8f, -9.281f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.976f, -0.414f)
                close()
                moveTo(9.301f, 7.357f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.21f, 0.803f)
                lineToRelative(0.716f, 2.148f)
                lineTo(13.6f, 8.246f)
                arcToRelative(2.438f, 2.438f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.978f, -0.892f)
                lineToRelative(0.213f, 0.09f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.584f, 1.381f)
                lineToRelative(-0.214f, -0.09f)
                arcToRelative(0.937f, 0.937f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.145f, 0.343f)
                lineToRelative(-2.021f, 3.033f)
                lineToRelative(1.084f, 3.255f)
                lineToRelative(1.445f, -0.89f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.786f, 1.278f)
                lineToRelative(-1.444f, 0.889f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.21f, -0.803f)
                lineToRelative(-0.716f, -2.148f)
                lineToRelative(-1.374f, 2.062f)
                arcToRelative(2.437f, 2.437f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.978f, 0.892f)
                lineToRelative(-0.213f, -0.09f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.584f, -1.381f)
                lineToRelative(0.214f, 0.09f)
                arcToRelative(0.938f, 0.938f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.145f, -0.344f)
                lineToRelative(2.021f, -3.032f)
                lineToRelative(-1.084f, -3.255f)
                lineToRelative(-1.445f, 0.89f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.786f, -1.278f)
                lineToRelative(1.444f, -0.89f)
                close()
            }
        }.build()

        return _Variable!!
    }

@Suppress("ObjectPropertyName")
private var _Variable: ImageVector? = null
