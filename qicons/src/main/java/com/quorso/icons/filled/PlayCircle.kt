package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "Filled.PlayCircle",
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
                moveTo(16.274f, 11.017f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.966f)
                lineToRelative(-5.603f, 3.113f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15.113f)
                lineTo(9f, 8.887f)
                curveToRelative(0f, -0.857f, 0.921f, -1.4f, 1.671f, -0.983f)
                lineToRelative(5.603f, 3.113f)
                close()
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
