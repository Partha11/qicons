package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Outlined.Moon",
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
                moveTo(21.752f, 15.002f)
                arcTo(9.72f, 9.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.75f)
                curveToRelative(-5.385f, 0f, -9.75f, -4.365f, -9.75f, -9.75f)
                curveToRelative(0f, -1.33f, 0.266f, -2.597f, 0.748f, -3.752f)
                arcTo(9.753f, 9.753f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.25f)
                curveTo(3f, 16.635f, 7.365f, 21f, 12.75f, 21f)
                arcToRelative(9.753f, 9.753f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.002f, -5.998f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
