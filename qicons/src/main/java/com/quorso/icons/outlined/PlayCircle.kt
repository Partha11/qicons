package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "Outlined.PlayCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.91f, 11.672f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.656f)
                lineToRelative(-5.603f, 3.113f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.557f, -0.328f)
                verticalLineTo(8.887f)
                curveToRelative(0f, -0.286f, 0.307f, -0.466f, 0.557f, -0.327f)
                lineToRelative(5.603f, 3.112f)
                close()
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
