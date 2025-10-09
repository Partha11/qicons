package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) {
            return _BellSlash!!
        }
        _BellSlash = ImageVector.Builder(
            name = "Outlined.BellSlash",
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
                moveTo(9.143f, 17.082f)
                arcToRelative(24.248f, 24.248f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.844f, 0.148f)
                moveToRelative(-3.844f, -0.148f)
                arcToRelative(23.856f, 23.856f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.455f, -1.31f)
                arcToRelative(8.964f, 8.964f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, -5.542f)
                moveToRelative(3.155f, 6.852f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.667f, 1.97f)
                moveToRelative(1.965f, -2.277f)
                lineTo(21f, 21f)
                moveToRelative(-4.225f, -4.225f)
                arcToRelative(23.81f, 23.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.536f, -1.003f)
                arcTo(8.967f, 8.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9.75f)
                verticalLineTo(9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.53f, 6.53f)
                moveToRelative(10.245f, 10.245f)
                lineTo(6.53f, 6.53f)
                moveTo(3f, 3f)
                lineToRelative(3.53f, 3.53f)
            }
        }.build()

        return _BellSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BellSlash: ImageVector? = null
