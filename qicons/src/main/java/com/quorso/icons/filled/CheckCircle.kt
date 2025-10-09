package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CheckCircle: ImageVector
    get() {
        if (_CheckCircle != null) {
            return _CheckCircle!!
        }
        _CheckCircle = ImageVector.Builder(
            name = "Filled.CheckCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
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

        return _CheckCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckCircle: ImageVector? = null
