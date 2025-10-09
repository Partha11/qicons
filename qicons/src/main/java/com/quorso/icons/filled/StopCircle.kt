package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "Filled.StopCircle",
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
                moveTo(8.25f, 9.562f)
                curveToRelative(0f, -0.724f, 0.588f, -1.312f, 1.313f, -1.312f)
                horizontalLineToRelative(4.874f)
                curveToRelative(0.725f, 0f, 1.313f, 0.588f, 1.313f, 1.313f)
                verticalLineToRelative(4.874f)
                curveToRelative(0f, 0.725f, -0.588f, 1.313f, -1.313f, 1.313f)
                lineTo(9.564f, 15.75f)
                arcToRelative(1.312f, 1.312f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.313f, -1.313f)
                lineTo(8.251f, 9.564f)
                close()
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
