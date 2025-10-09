package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Outlined.Heart",
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
                moveTo(21f, 8.25f)
                curveToRelative(0f, -2.485f, -2.099f, -4.5f, -4.688f, -4.5f)
                curveToRelative(-1.935f, 0f, -3.597f, 1.126f, -4.312f, 2.733f)
                curveToRelative(-0.715f, -1.607f, -2.377f, -2.733f, -4.313f, -2.733f)
                curveTo(5.1f, 3.75f, 3f, 5.765f, 3f, 8.25f)
                curveToRelative(0f, 7.22f, 9f, 12f, 9f, 12f)
                reflectiveCurveToRelative(9f, -4.78f, 9f, -12f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
