package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.LinkSlash: ImageVector
    get() {
        if (_LinkSlash != null) {
            return _LinkSlash!!
        }
        _LinkSlash = ImageVector.Builder(
            name = "Outlined.LinkSlash",
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
                moveTo(13.181f, 8.68f)
                arcToRelative(4.503f, 4.503f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.903f, 6.405f)
                moveToRelative(-9.768f, -2.782f)
                lineTo(3.56f, 14.06f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.364f, 6.365f)
                lineToRelative(3.129f, -3.129f)
                moveToRelative(5.614f, -5.615f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.364f, -6.365f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.258f, 0.26f, -0.479f, 0.541f, -0.661f, 0.84f)
                moveToRelative(1.903f, 6.405f)
                arcToRelative(4.495f, 4.495f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.242f, -0.88f)
                arcToRelative(4.483f, 4.483f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.062f, -1.683f)
                moveToRelative(6.587f, 2.345f)
                lineToRelative(5.907f, 5.907f)
                moveToRelative(-5.907f, -5.907f)
                lineTo(8.898f, 8.898f)
                moveTo(2.991f, 2.99f)
                lineTo(8.898f, 8.9f)
            }
        }.build()

        return _LinkSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSlash: ImageVector? = null
