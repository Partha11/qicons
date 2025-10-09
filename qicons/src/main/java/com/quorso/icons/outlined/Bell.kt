package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bell: ImageVector
    get() {
        if (_Bell != null) {
            return _Bell!!
        }
        _Bell = ImageVector.Builder(
            name = "Outlined.Bell",
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
                moveTo(14.857f, 17.082f)
                arcToRelative(23.848f, 23.848f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.454f, -1.31f)
                arcTo(8.967f, 8.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9.75f)
                verticalLineTo(9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                verticalLineToRelative(0.75f)
                arcToRelative(8.967f, 8.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.312f, 6.022f)
                curveToRelative(1.733f, 0.64f, 3.56f, 1.085f, 5.455f, 1.31f)
                moveToRelative(5.714f, 0f)
                arcToRelative(24.255f, 24.255f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.714f, 0f)
                moveToRelative(5.714f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.714f, 0f)
            }
        }.build()

        return _Bell!!
    }

@Suppress("ObjectPropertyName")
private var _Bell: ImageVector? = null
