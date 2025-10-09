package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) {
            return _EyeDropper!!
        }
        _EyeDropper = ImageVector.Builder(
            name = "Outlined.EyeDropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(15f, 11.25f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.75f, -0.75f)
                verticalLineTo(8.758f)
                lineToRelative(2.276f, -0.61f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.675f, -3.675f)
                lineToRelative(-0.61f, 2.277f)
                horizontalLineTo(12f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(1.5f, 1.5f)
                moveTo(15f, 11.25f)
                lineToRelative(-8.47f, 8.47f)
                curveToRelative(-0.34f, 0.34f, -0.8f, 0.53f, -1.28f, 0.53f)
                reflectiveCurveToRelative(-0.94f, 0.19f, -1.28f, 0.53f)
                lineToRelative(-0.97f, 0.97f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(0.97f, -0.97f)
                curveToRelative(0.34f, -0.34f, 0.53f, -0.8f, 0.53f, -1.28f)
                reflectiveCurveToRelative(0.19f, -0.94f, 0.53f, -1.28f)
                lineTo(12.75f, 9f)
                moveTo(15f, 11.25f)
                lineTo(12.75f, 9f)
            }
        }.build()

        return _EyeDropper!!
    }

@Suppress("ObjectPropertyName")
private var _EyeDropper: ImageVector? = null
