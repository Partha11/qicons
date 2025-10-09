package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) {
            return _CheckBadge!!
        }
        _CheckBadge = ImageVector.Builder(
            name = "Filled.CheckBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.603f, 3.799f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                curveToRelative(1.357f, 0f, 2.573f, 0.6f, 3.397f, 1.549f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.498f, 1.307f)
                arcToRelative(4.491f, 4.491f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.307f, 3.497f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.549f, 3.397f)
                arcToRelative(4.491f, 4.491f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.307f, 3.497f)
                arcToRelative(4.491f, 4.491f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.497f, 1.307f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.397f, -1.549f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.498f, -1.306f)
                arcToRelative(4.491f, 4.491f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.307f, -3.498f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                curveToRelative(0f, -1.357f, 0.6f, -2.573f, 1.549f, -3.397f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.307f, -3.497f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.497f, -1.307f)
                close()
                moveTo(15.61f, 10.186f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.22f, -0.872f)
                lineToRelative(-3.236f, 4.53f)
                lineTo(9.53f, 12.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, -0.094f)
                lineToRelative(3.75f, -5.25f)
                close()
            }
        }.build()

        return _CheckBadge!!
    }

@Suppress("ObjectPropertyName")
private var _CheckBadge: ImageVector? = null
