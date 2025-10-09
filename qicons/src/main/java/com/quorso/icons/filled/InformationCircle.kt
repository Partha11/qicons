package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.InformationCircle: ImageVector
    get() {
        if (_InformationCircle != null) {
            return _InformationCircle!!
        }
        _InformationCircle = ImageVector.Builder(
            name = "Filled.InformationCircle",
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
                moveTo(10.956f, 10.558f)
                curveToRelative(1.146f, -0.573f, 2.437f, 0.463f, 2.126f, 1.706f)
                lineToRelative(-0.709f, 2.836f)
                lineToRelative(0.042f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 1.34f)
                lineToRelative(-0.04f, 0.022f)
                curveToRelative(-1.147f, 0.573f, -2.438f, -0.463f, -2.127f, -1.706f)
                lineToRelative(0.71f, -2.836f)
                lineToRelative(-0.042f, 0.02f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.671f, -1.34f)
                lineToRelative(0.041f, -0.022f)
                close()
                moveTo(12f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
            }
        }.build()

        return _InformationCircle!!
    }

@Suppress("ObjectPropertyName")
private var _InformationCircle: ImageVector? = null
