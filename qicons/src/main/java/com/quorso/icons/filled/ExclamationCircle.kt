package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ExclamationCircle: ImageVector
    get() {
        if (_ExclamationCircle != null) {
            return _ExclamationCircle!!
        }
        _ExclamationCircle = ImageVector.Builder(
            name = "Filled.ExclamationCircle",
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
                moveTo(12f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(11.25f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(12f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
            }
        }.build()

        return _ExclamationCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ExclamationCircle: ImageVector? = null
