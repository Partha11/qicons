package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.XCircle: ImageVector
    get() {
        if (_XCircle != null) {
            return _XCircle!!
        }
        _XCircle = ImageVector.Builder(
            name = "Filled.XCircle",
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
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(10.28f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineTo(10.94f, 12f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineTo(12f, 13.06f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineTo(13.06f, 12f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.06f)
                lineTo(12f, 10.94f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()

        return _XCircle!!
    }

@Suppress("ObjectPropertyName")
private var _XCircle: ImageVector? = null
