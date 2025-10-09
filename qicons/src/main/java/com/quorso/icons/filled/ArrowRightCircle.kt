package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowRightCircle: ImageVector
    get() {
        if (_ArrowRightCircle != null) {
            return _ArrowRightCircle!!
        }
        _ArrowRightCircle = ImageVector.Builder(
            name = "Filled.ArrowRightCircle",
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
                moveTo(16.28f, 12.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(1.72f, 1.72f)
                lineTo(8.25f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(5.69f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(3f, -3f)
                close()
            }
        }.build()

        return _ArrowRightCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightCircle: ImageVector? = null
